package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070320 extends A000010 {

  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    mMax = mMax.max(super.next());
    return mMax;
  }
}
