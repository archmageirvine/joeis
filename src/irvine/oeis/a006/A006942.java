package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006942 Number of segments used to represent n on calculator display, variant 5: digits '6', '7' and '9' use 6, 3 and 6 segments, respectively.
 * variant 5: digits '6', '7' and '9' use 6, 3 and 6 segments, respectively.
 * @author Sean A. Irvine
 */
public class A006942 extends AbstractSequence implements DirectSequence {

  private final int[] mSegments;
  private int mN;

  /** Construct the sequence. */
  public A006942() {
    this(0, new int[] {6, 2, 5, 5, 4, 5, 6, 3, 7, 6});
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @segments number of segments used for the ten decimal digits
   */
  public A006942(final int offset, final int[] segments) {
    super(offset);
    mN = offset - 1;
    mSegments = segments;
  }

  @Override
  public Z a(final Z n) {
    final String s = n.toString();
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      sum += mSegments[s.charAt(k) - '0'];
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
