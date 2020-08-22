package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027488 Third column of triangle A027477, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027488 extends A027477 {

  private int mN = 2;
  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    final Z f = mF.factorial(++mN).pow(power());
    return mMatrix.get(mN - 1, 2).multiply(f).toZ();
  }
}
