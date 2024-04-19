package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A112935 Logarithmic derivative of A112934 such that a(n)=(1/2)*A112934(n+1) for n&gt;0, where A112934 equals the INVERT transform of double factorials A001147.
 * @author Georg Fischer
 */
public class A112935 extends AbstractSequence {

  private final AbstractSequence mSeq;
  private final int mMult;

  /** Construct the sequence. */
  public A112935() {
    this(1, new A112934(), 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param mult order of the factorial: 2 = double, 3 = triple and so on
   */
  public A112935(final int offset, final AbstractSequence seq, final int mult) {
    super(offset);
    mSeq = seq.skip(2);
    mMult = mult;
  }

  @Override
  public Z next() {
    return mSeq.next().divide(mMult);
  }
}
