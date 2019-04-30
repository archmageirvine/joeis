package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008560 <code>a(1) = 2</code>; to get <code>a(n), n &gt;= 2</code>, convert <code>a(n-1)</code> from base 3 to base 2.
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
