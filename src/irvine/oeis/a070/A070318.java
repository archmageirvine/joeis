package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a001.A001065;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070318 extends A001065 {

  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    mMax = mMax.max(super.next());
    return mMax;
  }
}
