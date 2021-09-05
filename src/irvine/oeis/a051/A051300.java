package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051299.
 * @author Sean A. Irvine
 */
public class A051300 implements Sequence {

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
