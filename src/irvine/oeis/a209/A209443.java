package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000118;
import irvine.oeis.a000.A000129;

/**
 * a(n) = Pell(n)*A000118(n) for n>=1 with a(0)=1, where A000118(n) is the number of ways of writing n as a sum of 4 squares.
 * @author Georg Fischer
 */
public class A209443 extends A000129 {

  private Sequence mSeq;
  private int mN;
  private int mOfs;


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
    mN = -1;
    if (offset > 0) {
      super.next();
    }
    mSeq = seq;
    mOfs = offset;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      mSeq.next();
      return Z.ONE;
    }
    return super.next().multiply(mSeq.next());
  }
}
