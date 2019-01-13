package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A003442.
 * @author Sean A. Irvine
 */
public class A003442 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>("y", Rationals.SINGLETON);

  static class VFunction extends MemoryFunction2<Integer, Polynomial<Q>> {
    private Z v(final long r, final long s) {
      assert r >= 0;
      if (r == 0) {
        return s == 1 ? Z.ONE : Z.ZERO;
      }
      if (s < r) {
        return Z.ZERO;
      }
      if (r == 1 && s == 1) {
        return Z.ZERO;
      }
      return Binomial.binomial(s - 2, r - 1).multiply(Binomial.binomial(r + s - 1, s)).divide(r);
    }

    @Override
    public Polynomial<Q> compute(final Integer r, final Integer n) {
      final ArrayList<Q> coeff = new ArrayList<>();
      for (int k = 0; k < n; ++k) {
        coeff.add(new Q(v(r, k)));
      }
      return RING.create(coeff);
    }
  }

  protected final MemoryFactorial mF = new MemoryFactorial();
  protected final VFunction mV = new VFunction();
  private final HashMap<Pair<Polynomial<Q>, Integer>, Polynomial<Q>> mPowerCache = new HashMap<>();

  private Polynomial<Q> power(final Polynomial<Q> v, final int p, final int n) {
    if (p == 1) {
      return v;
    }
    final Pair<Polynomial<Q>, Integer> key = new Pair<>(v, p);
    final Polynomial<Q> res = mPowerCache.get(key);
    if (res != null) {
      return res;
    }
    final Polynomial<Q> r = RING.pow(v, p, n);
    mPowerCache.put(key, r);
    return r;
  }

  protected Polynomial<Q> f(final int r, final int n) {
    if (r <= 1) {
      return r == 0 ? RING.zero() : RING.series(RING.monomial(Q.ONE, 3), RING.oneMinusXToTheN(1), n);
    }
    mPowerCache.clear();
    Polynomial<Q> sum = RING.zero();
    for (final Z d : Cheetah.factor(r - 1).divisors()) {
      final int dp = d.intValueExact();
      final int q = (r - 1) / dp;
      final IntegerPartition part = new IntegerPartition(q);
      final int[] a = new int[q + 1];
      int[] p;
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, a);
        final int sumA = (int) IntegerUtils.sum(a);
        final int start = (Math.max(3, sumA) + dp - 1) / dp;
        for (int m = start; m <= n; ++m) {
          if (sumA <= m) {
            Q c = new Q(mF.factorial(m - 1).multiply(LongUtils.phi(dp)), mF.factorial(m - sumA).multiply(dp));
            Polynomial<Q> v = RING.one();
            for (int i = 1; i < a.length; ++i) {
              if (a[i] > 0) {
                c = c.divide(mF.factorial(a[i]));
                v = RING.multiply(v, power(mV.get(i, n), a[i], n).substitutePower(dp, n));
              }
            }
            sum = RING.add(sum, RING.multiply(v, c).shift(dp * (m - sumA)).truncate(n));
          }
        }
      }
    }
    return sum;
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return f(mN, mN + 3).coeff(mN + 3).toZ();
  }
}

