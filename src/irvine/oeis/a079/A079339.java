package irvine.oeis.a079;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004290;

/**
 * A079339 Least k such that the decimal representation of k*n contains only 1's and 0's.
 * @author Georg Fischer
 */
public class A079339 extends AbstractSequence {

  private A004290 mSeq1 = new A004290();
  private long mN;

  /** Construct the sequence. */
  public A079339() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}
