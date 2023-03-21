package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A062135.
 * @author Sean A. Irvine
 */
public class A062156 extends A062154 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    step();
    return mEgf.coeff(mN).coeff(mN).multiply(MemoryFactorial.SINGLETON.factorial(mN).square()).toZ();
  }
}
