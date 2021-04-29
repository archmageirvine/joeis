package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046834 Internal digits of n^2 include digits of n as subsequence.
 * @author Sean A. Irvine
 */
public class A046834 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean is(final String square, final String n) {
    for (int k = 0, j = 1; j < square.length(); ++k, ++j) {
      if (k == n.length()) {
        return true;
      }
      while (j < square.length() - 1 && square.charAt(j) != n.charAt(k)) {
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
