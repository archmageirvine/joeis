package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045808 8-ish numbers (end in 67, 69, 81, 83).
 * @author Sean A. Irvine
 */
public class A045808 implements Sequence {

  private static final long[] STEPS = {84, 2, 12, 2};
  private long mN = -17;
  private int mT = -1;

  @Override
  public Z next() {
    if (++mT == STEPS.length) {
      mT = 0;
    }
    mN += STEPS[mT];
    return Z.valueOf(mN);
  }
}

