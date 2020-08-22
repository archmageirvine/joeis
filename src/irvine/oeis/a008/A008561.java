package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008561 a(1) = 3; a(2) = 11; to get a(n), n &gt;= 3, convert a(n-1) from base 3 to base 2.
 * @author Sean A. Irvine
 */
public class A008561 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : (mA.equals(Z.THREE) ? Z.valueOf(11) : new Z(new Z(mA.toString(), 3).toString(2)));
    return mA;
  }
}
