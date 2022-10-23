package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045807 7-ish numbers (end in 53, 71, 79, 97).
 * @author Sean A. Irvine
 */
public class A045807 extends Sequence1 {

  private static final long[] STEPS = {56, 18, 8, 18};
  private long mN = -3;
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

