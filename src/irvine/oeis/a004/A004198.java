package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004198 Table of x AND <code>y,</code> where <code>(x,y) = (0,0),(0,1),(1,0),(0,2),(1,1),(2,0),..</code>.
 * @author Sean A. Irvine
 */
public class A004198 implements Sequence {

  private long mRow = -1;
  private long mCol = -1;

  @Override
  public Z next() {
    if (--mCol < 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf((mRow - mCol) & mCol);
  }
}
