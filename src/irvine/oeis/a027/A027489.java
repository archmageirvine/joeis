package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027489 First column of Triangle A027478, constructed from Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027489 extends A027478 {

  private int mN = 0;

  @Override
  public Z next() {
    step();
    final Z f = Functions.FACTORIAL.z(++mN).pow(power());
    return mMatrix.get(mN - 1, 0).multiply(f).toZ();
  }
}
