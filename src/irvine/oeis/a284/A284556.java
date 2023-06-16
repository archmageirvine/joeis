package irvine.oeis.a284;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000360;
import irvine.oeis.a002.A002487;

/**
 * A284556 Sequence c of the mutual recurrence pair: b(0) = 0, b(1) = 1, b(2n) = c(n), b(2n+1) = b(n) + b(n+1), c(0) = c(1) = 0, c(2n) = b(n), c(2n+1) = c(n) + c(n+1).
 * @author Georg Fischer
 */
public class A284556 extends AbstractSequence {

  private int mN = -1;
  private A002487 mSeq1 = new A002487();
  private A000360 mSeq2 = new A000360();

  /** Construct the sequence. */
  public A284556() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A002487(n) - A000360(n-1).
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}
