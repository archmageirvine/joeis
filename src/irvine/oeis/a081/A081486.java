package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081486 Diagonal of triangle in A081485.
 * @author Sean A. Irvine
 */
public class A081486 extends A081485 {

  @Override
  public Z next() {
    step();
    return mRow[mRow.length - 1];
  }
}
