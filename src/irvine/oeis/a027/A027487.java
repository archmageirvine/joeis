package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027487 Second column of triangle <code>A027477</code>, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027487 extends A027477 {

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
