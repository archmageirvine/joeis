package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045805 5-ish numbers (end in 51, 57, 93, 99).
 * @author Sean A. Irvine
 */
public class A045805 extends Sequence1 {

  private static final long[] STEPS = {52, 6, 36, 6};
  private long mN = -1;
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

