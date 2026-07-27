package irvine.oeis.a395;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395681 a(n) is the number of positive integers m &lt;= n such that the set of primes dividing m or dividing an exponent in the prime factorization of m is disjoint from the corresponding set for n.
 * @author Sean A. Irvine
 */
public class A395681 extends Sequence1 {

  private int mN = 0;

  /**
   * Compute the set of primes dividing n or any exponent in the
   * prime factorization of n.
   */
  private Set<Z> primeSet(final int n) {
    final Set<Z> s = new HashSet<>();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      s.add(p);
      final int e = fs.getExponent(p);
      if (e > 1) {
        Collections.addAll(s, Jaguar.factor(e).toZArray());
      }
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    final Set<Z> pn = primeSet(mN);
    int cnt = 0;
    for (int k = 1; k <= mN; ++k) {
      final Set<Z> pk = primeSet(k);
      boolean ok = true;
      for (final Z p : pk) {
        if (pn.contains(p)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
