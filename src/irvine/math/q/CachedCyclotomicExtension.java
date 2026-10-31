package irvine.math.q;

import java.util.HashMap;
import java.util.Map;

import irvine.math.polynomial.Polynomial;
import irvine.math.r.DoubleUtils;
import irvine.util.string.StringUtils;

/**
 * Cache of operations in a cyclotomic extension.
 * @author Sean A. Irvine
 */
public final class CachedCyclotomicExtension extends CyclotomicExtension {

  /**
   * Construct the extension field of the rationals over a cyclotomic polynomial.
   * @param n power.
   */
  public CachedCyclotomicExtension(final long n) {
    super(n);
  }

  private final Map<Polynomial<Q>, Map<Polynomial<Q>, Polynomial<Q>>> mMultiplyCache = new HashMap<>();

  private long mMultiplyTotal = 0;
  private long mMultiplyHit = 0;

  @Override
  public Polynomial<Q> multiply(final Polynomial<Q> a, final Polynomial<Q> b) {
//    // Canonicalize arguments -- this was actually slower probably due to extra hashcode calls
//    if (a.hashCode() > b.hashCode()) {
//      final Polynomial<Q> t = a;
//      a = b;
//      b = t;
//    }
    ++mMultiplyTotal;
    Map<Polynomial<Q>, Polynomial<Q>> inner = mMultiplyCache.get(a);
    if (inner != null) {
      final Polynomial<Q> cached = inner.get(b);
      if (cached != null) {
        ++mMultiplyHit;
        return cached;
      }
    } else {
      inner = new HashMap<>();
      mMultiplyCache.put(a, inner);
    }

    final Polynomial<Q> result = super.multiply(a, b);
    inner.put(b, result);
    return result;
  }

  private final Map<Polynomial<Q>, Map<Polynomial<Q>, Polynomial<Q>>> mAddCache = new HashMap<>();

  private long mAddTotal = 0;
  private long mAddHit = 0;

  @Override
  public Polynomial<Q> add(final Polynomial<Q> a, final Polynomial<Q> b) {
    ++mAddTotal;
    Map<Polynomial<Q>, Polynomial<Q>> inner = mAddCache.get(a);
    if (inner != null) {
      final Polynomial<Q> cached = inner.get(b);
      if (cached != null) {
        ++mAddHit;
        return cached;
      }
    } else {
      inner = new HashMap<>();
      mAddCache.put(a, inner);
    }

    final Polynomial<Q> result = super.add(a, b);
    inner.put(b, result);
    return result;
  }

  private final Map<Polynomial<Q>, Map<Polynomial<Q>, Polynomial<Q>>> mSubtractCache = new HashMap<>();

  private long mSubtractTotal = 0;
  private long mSubtractHit = 0;

  @Override
  public Polynomial<Q> subtract(final Polynomial<Q> a, final Polynomial<Q> b) {
    ++mSubtractTotal;
    Map<Polynomial<Q>, Polynomial<Q>> inner = mSubtractCache.get(a);
    if (inner != null) {
      final Polynomial<Q> cached = inner.get(b);
      if (cached != null) {
        ++mSubtractHit;
        return cached;
      }
    } else {
      inner = new HashMap<>();
      mSubtractCache.put(a, inner);
    }

    final Polynomial<Q> result = super.subtract(a, b);
    inner.put(b, result);
    return result;
  }

  /**
   * Report caching stats.
   */
  public void reportStats() {
    StringUtils.message("mul hit rate " + mMultiplyHit + "/" + mMultiplyTotal + " (" + DoubleUtils.NF2.format(mMultiplyHit * 100.0 / mMultiplyTotal) + "%) cache size " + mMultiplyCache.size());
    StringUtils.message("add hit rate " + mAddHit + "/" + mAddTotal + " (" + DoubleUtils.NF2.format(mAddHit * 100.0 / mAddTotal) + "%) cache size " + mMultiplyCache.size());
    StringUtils.message("sub hit rate " + mSubtractHit + "/" + mSubtractTotal + " (" + DoubleUtils.NF2.format(mSubtractHit * 100.0 / mSubtractTotal) + "%) cache size " + mMultiplyCache.size());
  }

  private final HashMap<Polynomial<Q>, Polynomial<Q>> mInverseCache = new HashMap<>();

  @Override
  public Polynomial<Q> inverse(final Polynomial<Q> element) {
    return mInverseCache.computeIfAbsent(element, super::inverse);
  }

  private final HashMap<Polynomial<Q>, Polynomial<Q>> mConjugateCache = new HashMap<>();

  @Override
  public Polynomial<Q> conjugate(final Polynomial<Q> p) {
    return mConjugateCache.computeIfAbsent(p, super::conjugate);
  }

  private final HashMap<Polynomial<Q>, Integer> mSignCache = new HashMap<>();

  @Override
  public int signum(final Polynomial<Q> p) {
    return mSignCache.computeIfAbsent(p, super::signum);
  }
}
