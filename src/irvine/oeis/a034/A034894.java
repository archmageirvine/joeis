package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034894 Dropping any digit gives 0, 1 or a composite number.
 * @author Sean A. Irvine
 */
public class A034894 extends Sequence0 {

  private Z mN = Z.ZERO;

  private boolean is(final Z n) {
    final String s = n.toString();
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        if (new Z(s.substring(0, k) + s.substring(k + 1)).isProbablePrime()) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
