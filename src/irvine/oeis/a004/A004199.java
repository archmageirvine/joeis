package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004199 Table of <code>[ x/y ]</code>, where <code>(x,y) = (1,1),(1,2),(2,1),(1,3),(2,2),(3,1),..</code>.
 * @author Sean A. Irvine
 */
public class A004199 implements Sequence {

  private long mRow = 1;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      mCol = mRow;
      ++mRow;
    }
    return Z.valueOf((mRow - mCol) / mCol);
  }
}
