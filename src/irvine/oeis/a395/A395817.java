package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395817 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A395817 extends Sequence1 {

  private Z mA = null;

  private boolean is(final String s, final Z n) {
    final String t = n.toString();
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) + t.charAt(k) >= 10 + 2 * '0') {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String s = mA.toString();
    while (true) {
      mA = mA.add(1);
      if (is(s, mA)) {
        return mA;
      }
    }
  }
}
