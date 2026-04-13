package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.triangle.DirectArray;

/**
 * A003988 Triangle with subscripts (1,1),(2,1),(1,2),(3,1),(2,2),(1,3), etc. in which entry (i,j) is [ i/j ].
 * @author Sean A. Irvine
 */
public class A003988 extends Sequence1 implements DirectArray {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(mCol / (mRow - mCol + 1));
  }

  @Override
  public Z a(final long n, final long k) {
    return Z.valueOf(n).divide(k);
  }

}
