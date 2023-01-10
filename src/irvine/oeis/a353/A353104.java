package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007908;

/**
 * A353104 Base-4 representation of A007908(n).
 * @author Georg Fischer
 */
public class A353104 extends Sequence1 {

  private int mBase;
  private final Sequence mSeq;

  /** Construct the sequence. */
  public A353104() {
    this(new A007908(), 4);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param base target number base
   */
  public A353104(final Sequence seq, final int base) {
    mSeq = seq;
    mBase = base;
  }

  @Override
  public Z next() {
    return new Z(mSeq.next().toString(mBase));
  }
}
