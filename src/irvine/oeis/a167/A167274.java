package irvine.oeis.a167;
// manually trisum/trisum2 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a047.A047999;
import irvine.oeis.triangle.Inverse;

/**
 * A167274 Triangle read by rows, = 2*A047999 - A047999^(-1); = twice Sierpinski's gasket minus the inverse of Sierpinski's gasket.
 * @author Georg Fischer
 */
public class A167274 extends AbstractSequence {

  private final A047999 mSeq1 = new A047999();
  private final Inverse mSeq2 = new Inverse(0, new A047999());

  /** Construct the sequence. */
  public A167274() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}
