package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027491 Third column of Triangle A027478, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027491 extends A027478 {

  {
    setOffset(3);
    step();
    step();
  }

  private int mN = 2;

  @Override
  public Z next() {
    step();
    final Z f = Functions.FACTORIAL.z(++mN).pow(power());
    return mMatrix.get(mN - 1, 2).multiply(f).toZ();
  }
}
