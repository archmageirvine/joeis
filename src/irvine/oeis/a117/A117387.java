package irvine.oeis.a117;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a059.A059959;

/**
 * A117387 Prime nearest to 2^n. In case of a tie, choose the smaller.
 * @author Georg Fischer
 */
public class A117387 extends AbstractSequence {

  private A000079 mSeq1 = new A000079();
  private A059959 mSeq2 = new A059959();

  /** Construct the sequence. */
  public A117387() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
