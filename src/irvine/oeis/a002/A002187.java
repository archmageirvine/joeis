package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002187 Sprague-Grundy values for Dawson's Chess (octal game .137).
 * @author Sean A. Irvine
 */
public class A002187 extends Sequence0 {

  private static final int[] SEQ = {
    0, 1, 1, 2, 0, 3, 1, 1, 0, 3, 3, 2, 2, 4, 0, 5, 2, 2, 3, 3, 0, 1, 1, 3, 0, 2, 1, 1, 0, 4, 5, 2, 7, 4,
    0, 1, 1, 2, 0, 3, 1, 1, 0, 3, 3, 2, 2, 4, 4, 5, 5, 2, 3, 3, 0, 1, 1, 3, 0, 2, 1, 1, 0, 4, 5, 3, 7, 4,
    8, 1, 1, 2, 0, 3, 1, 1, 0, 3, 3, 2, 2, 4, 4, 5, 5, 9, 3, 3, 0, 1, 1, 3, 0, 2, 1, 1, 0, 4, 5, 3, 7, 4,
  };

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= SEQ.length) {
      mN = 68;
    }
    return Z.valueOf(SEQ[mN]);
  }
}
