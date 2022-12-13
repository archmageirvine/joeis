package irvine.oeis.a077;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a110.A110660;

/**
 * A077612 Number of adjacent pairs of form (even,even) among all permutations of {1,2,...,n}.
 * @author Georg Fischer
 */
public class A077612 extends AbstractSequence {

  private int mN = 0;
  private A110660 mSeq1 = new A110660();
  private A000142 mSeq2 = new A000142();

  /** Construct the sequence. */
  public A077612() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : mSeq1.next().multiply(mSeq2.next());
  }
}
