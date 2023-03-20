package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062118 Numbers k such that k^2 has k as its middle digits.
 * @author Sean A. Irvine
 */
public class A062118 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.square().toString();
      final String u = mN.toString();
      if ((s.length() & 1) == (u.length() & 1) && s.substring((s.length() - u.length()) / 2).startsWith(u)) {
        return mN;
      }
    }
  }
}
