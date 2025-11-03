package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081516 Final term in n-th row of A081517.
 * @author Sean A. Irvine
 */
public class A081516 extends A081517 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mRow[mRow.length - 1]);
  }
}
