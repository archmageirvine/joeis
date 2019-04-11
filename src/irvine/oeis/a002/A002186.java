package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002186 Sprague-Grundy values for the game of Kayles (octal games <code>.77</code> and <code>.771)</code>.
 * @author Sean A. Irvine
 */
public class A002186 implements Sequence {

  private static final int[] SEQ = {
    0, 1, 2, 3, 1, 4, 3, 2, 1, 4, 2, 6,
    4, 1, 2, 7, 1, 4, 3, 2, 1, 4, 6, 7,
    4, 1, 2, 8, 5, 4, 7, 2, 1, 8, 6, 7,
    4, 1, 2, 3, 1, 4, 7, 2, 1, 8, 2, 7,
    4, 1, 2, 8, 1, 4, 7, 2, 1, 4, 2, 7,
    4, 1, 2, 8, 1, 4, 7, 2, 1, 8, 6, 7,
    4, 1, 2, 8, 1, 4, 7, 2, 1, 8, 2, 7,
  };

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= SEQ.length) {
      mN = 72;
    }
    return Z.valueOf(SEQ[mN]);
  }
}
