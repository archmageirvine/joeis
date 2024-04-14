package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000079;

/**
 * A004094 Powers of 2 written backwards.
 * @author Georg Fischer
 */
public class A004094 extends AbstractSequence {

  private final Sequence mSeq;

  /** Construct the sequence. */
  public A004094() {
    this(0, new A000079());
  }

  /**
   * Generic constructor with parameters
   * @param offset sequence offset
   * @param seq underlying sequence
   */
  public A004094(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  @Override
  public Z next() {
    return Functions.REVERSE.z(mSeq.next());
  }
}
