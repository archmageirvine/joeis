package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A079124 Number of ways to partition n into distinct positive integers &lt;= phi(n), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A079124 extends A079122 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, Functions.PHI.i(mN));
  }
}

