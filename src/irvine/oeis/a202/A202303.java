package irvine.oeis.a202;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023110;

/**
 * A202303 Drop the last digit of A023110(n).
 * @author Georg Fischer
 */
public class A202303 extends Sequence1 {

  private final Sequence mSeq;
  private final int mBase;

  /** Construct the sequence. */
  public A202303() {
    this(new A023110(), 10);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param base number base
   */
  public A202303(final Sequence seq, final int base) {
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    final String s = mSeq.next().toString(mBase);
    if (s.length() <= 1) {
      return Z.ZERO;
    }
    return new Z(s.substring(0, s.length() - 1), mBase);
  }
}
