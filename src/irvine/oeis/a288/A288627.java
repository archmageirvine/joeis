package irvine.oeis.a288;

import java.util.Map;

import irvine.math.LongUtils;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A288627 Triangle read by rows: T(n,k) = number of step cyclic shifted sequence structures of length n using exactly k different symbols.
 * @author Sean A. Irvine
 */
public class A288627 extends A288620 {

  private long m(final long j, final long l) {
    long m = 1;
    long s = 0;
    long k = 1;
    while ((s += k) % l != 0) {
      k *= j;
      k %= l;
      ++m;
    }
    return m;
  }

  // Z(E_n)
  @Override
  protected CycleIndex compute(final Integer n) {
    final CycleIndex ci = new CycleIndex();
    for (long k = 0; k < n; ++k) {
      if (LongUtils.gcd(n, k) == 1) {
        final Q mmc = new Q(n, LongUtils.gcd(n, k - 1));
        for (long c = 1; c <= LongUtils.gcd(n, k - 1); ++c) {
          final MultivariateMonomial mm = new MultivariateMonomial();
          for (int i = 1; i <= n; ++i) {
            final long mi = m(k, n / LongUtils.gcd(n, i * (k - 1) + c));
            mm.add((int) mi, 1);
          }
          mm.setCoefficient(mmc);
          ci.add(mm);
        }
      }
    }
    // Correct for powering
    // Formula above actually requires x_m^(1/m), but we did x_m^1, so we need
    // to go through reducing each power x_m^k to x_m^(k/m) in the result.
    final CycleIndex res = new CycleIndex("E(" + n + ")");
    for (final MultivariateMonomial mm : ci.values()) {
      final MultivariateMonomial rmm = new MultivariateMonomial();
      for (final Map.Entry<Pair<String, Integer>, Z> e : mm.entrySet()) {
        final int idx = e.getKey().right();
        rmm.add(idx, e.getValue().divide(idx));
      }
      rmm.setCoefficient(mm.getCoefficient());
      res.add(rmm);
    }
    res.multiply(new Q(1, Euler.phiAsLong((long) n) * n));
    return res;
  }
}
