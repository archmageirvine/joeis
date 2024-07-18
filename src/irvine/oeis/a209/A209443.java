package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000118;
import irvine.oeis.a000.A000129;

/**
 * A209443 a(n) = Pell(n)*A000118(n) for n&gt;=1 with a(0)=1, where A000118(n) is the number of ways of writing n as a sum of 4 squares.
 * @author Georg Fischer
 */
public class A209443 extends AbstractSequence {

  private final A000129 mPell = new A000129();
  private final Sequence mSeq;
  private int mN;

  /** Construct the sequence. */
  public A209443() {
    this(0, new A000118());
  }

  /**
   * Generic constructor with parameter
   * @param offset index of first term of <code>seq</code>
   * @param seq underlying sequence
   */
  public A209443(final int offset, final Sequence seq) {
    super(offset);
    mN = -1;
    if (offset > 0) {
      mPell.next();
    }
    mSeq = seq;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mPell.next();
      mSeq.next();
      return Z.ONE;
    }
    return mPell.next().multiply(mSeq.next());
  }
}
