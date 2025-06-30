package irvine.oeis.a373;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A373033 a(0) = 5. For n &gt;= 1, a(n) = a(n-1) converted to base 4 and interpreted in base 10.
 * @author Sean A. Irvine
 */
public class A373033 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(4));
    return mA;
  }
}
