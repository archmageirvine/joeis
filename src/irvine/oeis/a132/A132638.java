package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002378;

/**
 * A132638 Numbers of the form m^m where m is oblong (promic).
 * @author Georg Fischer
 */
public class A132638 extends AbstractSequence {

  private final Sequence mSeq;

  /** Construct the sequence. */
  public A132638() {
    this(1, new A002378(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param offset2 offset of seq
   */
  public A132638(final int offset, final Sequence seq, int offset2) {
    super(1);
    mSeq = seq;
    while (++offset2 <= offset) {
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    final Z t = mSeq.next();
    return t.pow(t.intValue());
  }
}
