package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046851 Numbers n such that n^2 can be obtained from n by inserting internal (but not necessarily contiguous) digits.
 * @author Sean A. Irvine
 */
public class A046851 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean is(final String square, final String n) {
    if (square.charAt(0) != n.charAt(0)) {
      return false;
    }
    if (square.charAt(square.length() - 1) != n.charAt(n.length() - 1)) {
      return false;
    }
    if (square.length() == 1) {
      return true; // 0 and 1
    }
    for (int k = 1, j = 1; j < square.length(); ++k, ++j) {
      if (k == n.length() - 1) {
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
