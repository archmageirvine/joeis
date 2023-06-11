package irvine.oeis.a133;
// manually trisum/trisum2 at 2023-06-10 10:12

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000012;

/**
 * A133115 2*A133113 - A000012.
 * @author Georg Fischer
 */
public class A133115 extends AbstractSequence {

  private final A133113 mSeq1 = new A133113();
  private final A000012 mSeq2 = new A000012();

  /** Construct the sequence. */
  public A133115() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}
