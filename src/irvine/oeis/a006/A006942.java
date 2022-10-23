package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006942 Number of segments used to represent n on calculator display, variant 5: digits '6', '7' and '9' use 6, 3 and 6 segments, respectively.
 * @author Sean A. Irvine
 */
public class A006942 extends Sequence0 {

  private static final int[] SEGMENTS = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      sum += SEGMENTS[s.charAt(k) - '0'];
    }
    return Z.valueOf(sum);
  }
}
