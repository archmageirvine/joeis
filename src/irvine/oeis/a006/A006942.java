package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006942 Number of segments needed to represent n on calculator display.
 * @author Sean A. Irvine
 */
public class A006942 implements Sequence {

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
