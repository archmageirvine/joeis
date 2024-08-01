package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051300 a(n) = a(n-1) + rotate( a(n-1), 1 digit right), a(1) = 1.
 * @author Sean A. Irvine
 */
public class A051300 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = mA.toString();
      mA = mA.add(new Z(s.charAt(s.length() - 1) + s.substring(0, s.length() - 1)));
    }
    return mA;
  }
}
