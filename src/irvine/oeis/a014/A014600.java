package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000003;

/**
 * A014600.
 * @author Sean A. Irvine
 */
public class A014600 extends A000003 {

  // Interleave A000003 and A014599

  private long mD = 0;
  private long mDelta = 3;

  @Override
  public Z next() {
    mD -= mDelta;
    mDelta = 4 - mDelta;
    return Z.valueOf(classNumber(mD));
  }
}
