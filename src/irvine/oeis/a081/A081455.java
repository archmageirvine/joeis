package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081455 Final entry of n-th row of triangle in A081454.
 * @author Sean A. Irvine
 */
public class A081455 extends A081454 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mRow[mRow.length - 1]);
  }
}
