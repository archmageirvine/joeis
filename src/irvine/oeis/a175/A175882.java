package irvine.oeis.a175;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002489;
import irvine.oeis.a090.A090602;

/**
 * A175882 Number of groupoids of order n with no identity element.
 * @author Georg Fischer
 */
public class A175882 extends AbstractSequence {

  private int mN = -1;
  private final A002489 mSeq1 = new A002489();
  private final A090602 mSeq2 = new A090602();

  /** Construct the sequence. */
  public A175882() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (++mN == 0) ? Z.ONE : mSeq1.next().subtract(mSeq2.next());
  }
}
