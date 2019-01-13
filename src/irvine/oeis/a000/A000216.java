package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000216.
 * @author Sean A. Irvine
 */
public class A000216 implements Sequence {

  private static final int[] SEQ = {4, 16, 37, 58, 89, 145, 42, 20};

  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.TWO;
    }
    return Z.valueOf(SEQ[mN & 7]);
  }
}
