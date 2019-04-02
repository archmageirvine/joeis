package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000218 Take sum of squares of digits of previous term; start with 3.
 * @author Sean A. Irvine
 */
public class A000218 implements Sequence {

  private static final int[] PSEQ = {3, 9, 81, 65, 61};
  private static final int[] SEQ = {37, 58, 89, 145, 42, 20, 4, 16};

  private int mN = -6;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.valueOf(PSEQ[mN + 5]);
    } else {
      return Z.valueOf(SEQ[mN & 7]);
    }
  }
}
