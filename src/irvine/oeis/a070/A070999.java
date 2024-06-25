package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070999 Numbers n such that the denominator of Sum_{k=1..n} 1/gcd(n,k) is not equal to n.
 * @author Sean A. Irvine
 */
public class A070999 extends Sequence1 {

  private int mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (!Rationals.SINGLETON.sum(1, mN, k -> new Q(1, Functions.GCD.i(k, mN))).den().equals(n)) {
        return n;
      }
    }
  }
}
