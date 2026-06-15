package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a003.A003337;

/**
 * A085322 Terms m of A003337 such that m+1 is also in A003337; i.e., smaller of two consecutive numbers, both equal to a sum of three 4th powers.
 * @author Sean A. Irvine
 */
public class A085322 extends A003337 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
