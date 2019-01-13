package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000204;

/**
 * A005972.
 * @author Sean A. Irvine
 */
public class A005972 extends A000204 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().pow(4));
    return mSum;
  }
}
