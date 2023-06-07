package irvine.oeis.a167;
// manually trisum/trisum2 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a047.A047999;

/**
 * A167366 Triangle read by rows, 2*A047999 - A097806 (signed) = twice Sierpinski&apos;s gasket - the signed pair sum operator.
 * @author Georg Fischer
 */
public class A167366 extends AbstractSequence {

  private final A047999 mSeq1 = new A047999();
  private final A167374 mSeq2 = new A167374();

  /** Construct the sequence. */
  public A167366() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}
