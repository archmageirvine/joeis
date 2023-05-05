package irvine.oeis.a318;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001065;
import irvine.oeis.a032.A032742;

/**
 * A318505 Sum of divisors of n, up to, but not including the second largest of them A032742(n); a(1) = 0 by convention.
 * @author Georg Fischer
 */
public class A318505 extends AbstractSequence {

  private int mN = 0;
  private A001065 mSeq1 = new A001065();
  private A032742 mSeq2 = new A032742();

  /** Construct the sequence. */
  public A318505() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ZERO : result;
  }
}
