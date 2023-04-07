package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046829 Numbers k such that digits of k^2 include digits of k as subsequence.
 * @author Sean A. Irvine
 */
public class A046829 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean is(final String square, final String n) {
    for (int k = 0, j = 0; j <= square.length(); ++k, ++j) {
      if (k == n.length()) {
        return true;
      }
      while (j < square.length() && square.charAt(j) != n.charAt(k)) {
        ++j;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN.square().toString(), mN.toString())) {
        return mN;
      }
    }
  }
}
