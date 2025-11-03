package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081522 Last term in row n of A081521.
 * @author Sean A. Irvine
 */
public class A081522 extends A081521 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mRow[mRow.length - 1]);
  }
}
