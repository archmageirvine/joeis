package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027491 Third column of Triangle A027478, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027491 extends A027478 {

  {
    setOffset(3);
  }

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
