package irvine.oeis.a182;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a046.A046746;

/**
 * A182708 a(n) is the sum of the smallest parts of all partitions of n that do not contain 1 as a part.
 * @author Georg Fischer
 */
public class A182708 extends AbstractSequence {

  private final A046746 mSeq1 = new A046746();
  private final A000041 mSeq2 = new A000041();

  /** Construct the sequence. */
  public A182708() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
