package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051299 a(n) = a(n-1) + rotate( a(n-1), 1 digit left), a(1) = 1.
 * @author Sean A. Irvine
 */
public class A051299 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = mA.multiply(10).toString();
      mA = mA.add(new Z(s.substring(1)).add(s.charAt(0) - '0'));
    }
    return mA;
  }
}
