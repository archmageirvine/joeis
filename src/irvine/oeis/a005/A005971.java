package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000204;

/**
 * A005971 Sum of cubes of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A005971 extends A000204 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(3));
    return mSum;
  }
}
