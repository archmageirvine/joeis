package irvine.oeis.a358;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.a065.A065120;

/**
 * A358135 Difference of first and last parts of the n-th composition in standard order.
 * @author Georg Fischer
 */
public class A358135 extends AbstractSequence {

  private final A001511 mSeq1 = new A001511();
  private final A065120 mSeq2 = new A065120();

  /** Construct the sequence. */
  public A358135() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
