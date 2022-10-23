package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005151 Summarize the previous term (digits in increasing order), starting with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A005151 extends Sequence1 {

  private static final long[] S = {1, 11, 21, 1112, 3112, 211213, 312213, 212223, 114213, 31121314, 41122314, 31221324, 21322314};
  private int mN = -1;
  @Override
  public Z next() {
    if (mN < S.length - 1) {
      ++mN;
    }
    return Z.valueOf(S[mN]);
  }
}
