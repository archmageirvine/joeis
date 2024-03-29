package irvine.oeis.a083;
// Generated by gen_seq4.pl A105599/tripnk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a105.A105599;

/**
 * A083483 Number of forests with two connected components in the complete graph K_{n}.
 * @author Georg Fischer
 */
public class A083483 extends AbstractSequence {

  private int mN;
  private final A105599 mSeq = new A105599();

  /** Construct the sequence. */
  public A083483() {
    super(1);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 1);
  }
}

