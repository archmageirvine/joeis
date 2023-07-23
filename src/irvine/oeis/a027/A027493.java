package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027493 Second column of Triangle A027479, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027493 extends A027479 {

  {
    setOffset(2);
  }

  private int mN = 1;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    final Z f = mF.factorial(++mN).pow(power());
    return mMatrix.get(mN - 1, 1).multiply(f).toZ();
  }
}
