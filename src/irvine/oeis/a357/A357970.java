package irvine.oeis.a357;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006942;

/**
 * A357970 a(n) is the number of segments used to represent the time of n minutes past midnight in the format hh:mm on a 7-segment calculator display; version where the digits &apos;6&apos;, &apos;7&apos; and &apos;9&apos; use 6, 3 and 6 segments, respectively.
 * A357970 a(0) = 24, a(n) = A006942(A055643(n)) + 6*(4 - ceiling(log10(A055643(n) + 1))) for n &gt; 0.
 * @author Georg Fischer
 */
public class A357970 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final DirectSequence mSeq;

  /** Construct the sequence. */
  public A357970() {
    this(0, new A006942());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq sequence which counts the segments in n
   */
  public A357970(final int offset, final DirectSequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
  }

  @Override
  public Z a(Z n) {
    n = n.mod(Z.valueOf(1440)); // 24:00 -> 00:00
    if (n.isZero()) {
      return Z.valueOf(24); // (2 left, 2 right, 1 top, 1 bottom) * 4
    }
    final String babyln = n.toTwoDigits(60);
    return mSeq.a(new Z(babyln)).add(6 * (4 - babyln.length())); // add the segments of the leading zeros needed to fill 4 digits
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
