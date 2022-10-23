package irvine.oeis.a059;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Triple;

/**
 * A059965 For m&gt;0, each n+m &gt; 5 is expressed as Sum_{k = x,y,z}(pk)_m where (pk)_m is a prime with x &lt;= y &lt;= z; a(n) = largest m such that (pk)_1 = (pk)_2 = ... = (pk)_m.
 * @author Sean A. Irvine
 */
public class A059965 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Long, List<Triple<Long>>> mCache = new TreeMap<>();
  private long mN = 0;

  private List<Triple<Long>> computeRepresentations(final long n) {
    final List<Triple<Long>> res = new ArrayList<>();
    for (long p = 2; p <= n / 3; p = mPrime.nextPrime(p)) {
      for (long q = p; q <= (n - p) / 2; q = mPrime.nextPrime(q)) {
        final long r = n - p - q;
        if (mPrime.isPrime(r)) {
          res.add(new Triple<>(p, q, r));
        }
      }
    }
    return res;
  }

  private List<Triple<Long>> representations(final long n) {
    if (!mCache.containsKey(n)) {
      mCache.put(n, computeRepresentations(n));
    }
    return mCache.get(n);
  }

  private boolean match(final long v, final Triple<Long> t) {
    return t.left() == v || t.mid() == v || t.right() == v;
  }

  private long consider(final long v, long m) {
    while (true) {
      ++m;
      boolean ok = false;
      for (final Triple<Long> rep : representations(m)) {
        if (match(v, rep)) {
          ok = true;
          break;
        }
      }
      if (!ok) {
        return m;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> tried = new HashSet<>();
    long max = mN;
    for (final Triple<Long> rep : representations(mN)) {
      if (tried.add(rep.left())) {
        final long m = consider(rep.left(), mN);
        if (m > max) {
          max = m;
        }
      }
      if (tried.add(rep.mid())) {
        final long m = consider(rep.mid(), mN);
        if (m > max) {
          max = m;
        }
      }
      if (tried.add(rep.right())) {
        final long m = consider(rep.right(), mN);
        if (m > max) {
          max = m;
        }
      }
    }
    mCache.remove(mN);
    return Z.valueOf(max - mN);
  }
}
