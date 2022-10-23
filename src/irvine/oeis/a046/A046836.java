package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046836 Internal digits of n^2 include digits of n as substring.
 * @author Sean A. Irvine
 */
public class A046836 extends Sequence1 {

  private Z mN = Z.valueOf(49);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.square().toString();
      if (s.substring(1, s.length() - 1).contains(mN.toString())) {
        return mN;
      }
    }
  }
}
