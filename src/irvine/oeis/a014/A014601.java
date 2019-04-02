package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014601 Numbers congruent to 0 or 3 mod 4.
 * @author Sean A. Irvine
 */
public class A014601 implements Sequence {

  private long mD = -1;
  private long mDelta = 3;

  @Override
  public Z next() {
    mDelta = 4 - mDelta;
    mD += mDelta;
    return Z.valueOf(mD);
  }
}
