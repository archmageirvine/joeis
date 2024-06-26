package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027494 Third column of Triangle A027479, constructed from the Stirling numbers of the first kind..
 * @author Sean A. Irvine
 */
public class A027494 extends A027479 {

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
