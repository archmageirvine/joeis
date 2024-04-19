package irvine.oeis.a106;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003239;
import irvine.oeis.a068.A068875;

/**
 * A106520 a(n) = A068875(n-1) - A003239(n).
 * @author Georg Fischer
 */
public class A106520 extends AbstractSequence {

  private int mN = -1;
  private final A068875 mSeq1 = new A068875();
  private final A003239 mSeq2 = new A003239();

  /** Construct the sequence. */
  public A106520() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ONE : result;
  }
}
