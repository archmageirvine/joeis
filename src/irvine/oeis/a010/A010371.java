package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010371 Number of segments used to represent n on a 7-segment calculator display; version where <code>'6', '7'</code> and <code>'9'</code> use <code>6, 4</code> and 6 segments, respectively.
 * @author Sean A. Irvine
 */
public class A010371 implements Sequence {

  private static final int[] SEGMENTS = {6, 2, 5, 5, 4, 5, 6, 4, 7, 6};
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
