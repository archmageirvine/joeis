package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000221 Take sum of squares of digits of previous term; start with 5.
 * @author Sean A. Irvine
 */
public class A000221 extends Sequence1 {

  private static final int[] PSEQ = {5, 25, 29, 85};
  private static final int[] SEQ = {89, 145, 42, 20, 4, 16, 37, 58};

  private int mN = -5;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.valueOf(PSEQ[mN + 4]);
    } else {
      return Z.valueOf(SEQ[mN & 7]);
    }
  }
}
