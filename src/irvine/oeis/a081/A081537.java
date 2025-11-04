package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081537 LCM of row n of triangle in A081536.
 * @author Sean A. Irvine
 */
public class A081537 extends A081536 {

  @Override
  public Z next() {
    step();
    return mRow[0].isZero() ? Z.ZERO : Functions.LCM.z(mRow);
  }
}
