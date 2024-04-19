package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A027486 First column of triangle A027477, constructed from the Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A027486 extends A027477 {

  private int mN = 0;

  @Override
  public Z next() {
    step();
    final int n = ++mN;
    final Z f = Functions.FACTORIAL.z(n).pow(power());
    return mMatrix.get(mN - 1, 0).multiply(f).toZ();
  }
}
