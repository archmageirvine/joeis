package irvine.oeis.a189;
// manually anopan 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a033.A033286;

/**
 * A189892 a(n) = n*prime(n) - sum_{i=1..n-1} prime(i).
 * @author Georg Fischer
 */
public class A189892 extends AbstractSequence {

  private int mN = 0;
  private A033286 mSeq1 = new A033286();
  private A007504 mSeq2 = new A007504();

  /** Construct the sequence. */
  public A189892() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.TWO : mSeq1.next().subtract(mSeq2.next());
  }
}
