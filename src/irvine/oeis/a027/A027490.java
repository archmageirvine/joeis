package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027490 Second column of Triangle A027478, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027490 extends A027478 {

  {
    setOffset(2);
    step();
  }

  private int mN = 1;

  @Override
  public Z next() {
    step();
    final Z f = Functions.FACTORIAL.z(++mN).pow(power());
    return mMatrix.get(mN - 1, 1).multiply(f).toZ();
  }
}
