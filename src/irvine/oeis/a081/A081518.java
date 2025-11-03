package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081518 Final term in row n of A081520.
 * @author Sean A. Irvine
 */
public class A081518 extends A081520 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mRow[mRow.length - 1]);
  }
}
