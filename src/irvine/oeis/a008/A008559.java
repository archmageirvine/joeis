package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008559 <code>a(1)=2</code>; thereafter, convert <code>a(n-1)</code> from base 10 to base 2 but regard the result as a base 10 number.
 * @author Sean A. Irvine
 */
public class A008559 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2));
    return mA;
  }
}
