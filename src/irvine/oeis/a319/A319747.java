package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A319747 a(n) = A319726(n) + A319657(n).
 * @author Georg Fischer
 */
public class A319747 extends Sequence0 {

  private final Sequence mSeq1;
  private final Sequence mSeq2;

  /** Construct the sequence. */
  public A319747() {
    this(new A319726(), new A319657());
  }

  /**
   * Generic constructor with parameters
   * @param seq1 first underlying sequence
   * @param seq2 second underlying sequence
   */
  public A319747(final Sequence seq1, final Sequence seq2) {
    mSeq1 = seq1;
    mSeq2 = seq2;
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
