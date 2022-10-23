package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045806 6-ish numbers (end in 23, 27, 61, 89).
 * @author Sean A. Irvine
 */
public class A045806 extends Sequence1 {

  private static final long[] STEPS = {34, 4, 34, 28};
  private long mN = -11;
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

