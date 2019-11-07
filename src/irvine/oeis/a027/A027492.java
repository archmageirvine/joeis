package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027492 First column of Triangle <code>A027479</code>, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027492 extends A027479 {

  private int mN = 0;

  @Override
  public Z next() {
    step();
    final Z f = mF.factorial(++mN).pow(power());
    return mMatrix.get(mN - 1, 0).multiply(f).toZ();
  }
}
