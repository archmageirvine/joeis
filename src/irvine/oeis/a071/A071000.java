package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071000 Numbers m such that the denominator of Sum_{k=1..m} 1/gcd(m,k) equals m.
 * @author Sean A. Irvine
 */
public class A071000 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Rationals.SINGLETON.sum(1, mN, k -> new Q(1, Functions.GCD.i(k, mN))).den().equals(n)) {
        return n;
      }
    }
  }
}
