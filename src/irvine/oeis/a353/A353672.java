package irvine.oeis.a353;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059841;

/**
 * A353672 a(n) = 1 if n is an even number with an even number of distinct prime factors, otherwise 0.
 * @author Georg Fischer
 */
public class A353672 extends AbstractSequence {

  private A059841 mSeq1 = new A059841();
  private A353674 mSeq2 = new A353674();

  /** Construct the sequence. */
  public A353672() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
