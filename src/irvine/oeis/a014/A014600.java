package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000003;

/**
 * A014600 Class numbers h(D) of imaginary quadratic orders with discriminant D == 0 or 1 mod 4, D&lt;0.
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
    return Z.valueOf(LongUtils.classNumber(mD));
  }
}
