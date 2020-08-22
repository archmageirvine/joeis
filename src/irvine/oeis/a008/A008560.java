package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008560 a(1) = 2; to get a(n), n &gt;= 2, convert a(n-1) from base 3 to base 2.
 * @author Sean A. Irvine
 */
public class A008560 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(new Z(mA.toString(), 3).toString(2));
    return mA;
  }
}
