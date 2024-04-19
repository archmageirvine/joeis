package irvine.oeis.a118;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a045.A045954;

/**
 * A118125 Difference between the even Lucky numbers (A045954) minus the odd Lucky numbers (A000959).
 * @author Georg Fischer
 */
public class A118125 extends AbstractSequence {

  private final A045954 mSeq1 = new A045954();
  private final A000959 mSeq2 = new A000959();

  /** Construct the sequence. */
  public A118125() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq2.next().subtract(mSeq1.next());
  }
}
