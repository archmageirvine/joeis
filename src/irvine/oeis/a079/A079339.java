package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004290;

/**
 * A079339 Least k such that the decimal representation of k*n contains only 1's and 0's.
 * @author Georg Fischer
 */
public class A079339 extends Sequence1 {

  private final Sequence mSeq1 = new A004290();
  private long mN = 0;

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}
