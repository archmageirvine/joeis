package irvine.oeis.a255;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002496;
import irvine.oeis.a005.A005574;

/**
 * A255675 Least integer k such that the n-th prime of form m^2+1 divides the composite number k^2+1.
 * @author Georg Fischer
 */
public class A255675 extends AbstractSequence {

  private int mN = 0;
  private A002496 mSeq1 = new A002496();
  private A005574 mSeq2 = new A005574();

  /** Construct the sequence. */
  public A255675() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 1) ? Z.THREE : result;
  }
}
