package irvine.oeis.a274;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a005.A005411;

/**
 * A274844 The inverse multinomial transform of A001818(n) = ((2*n-1)!!)^2.
 * @author Georg Fischer
 */
public class A274844 extends AbstractSequence {

  private A000079 mSeq1 = new A000079();
  private A005411 mSeq2 = new A005411();

  /** Construct the sequence. */
  public A274844() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
