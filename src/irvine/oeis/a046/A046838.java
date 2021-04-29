package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046838 Numbers n such that n^2 can be obtained from n by inserting a block of digits.
 * @author Sean A. Irvine
 */
public class A046838 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean is(final String square, final String n) {
    final int l = n.length();
    final int m = square.length();
    for (int k = 0; k < m - l + 1; ++k) {
      if ((square.substring(0, k) + square.substring(m - (l - k))).equals(n)) {
        return true;
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
