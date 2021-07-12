package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048653 Numbers k such that the decimal digits of k^2 can be partitioned into two or more nonzero squares.
 * @author Sean A. Irvine
 */
public class A048653 implements Sequence {

  private Z mN = Z.SIX;

  private static boolean isSquarePartitionable2(final String s) {
    if (s.isEmpty()) {
      return true;
    }
    if (s.charAt(0) == '0') {
      return false;
    }
    for (int k = s.length(); k >= 1; --k) {
      final Z n = new Z(s.substring(0, k));
      if (n.isSquare() && isSquarePartitionable2(s.substring(k))) {
        return true;
      }
    }
    return false;
  }

  static boolean isSquarePartitionable(final String s) {
    for (int k = 1; k < s.length(); ++k) {
      if (s.charAt(k) != '0' && isSquarePartitionable2(s.substring(0, k)) && isSquarePartitionable2(s.substring(k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isSquarePartitionable(mN.square().toString())) {
        return mN;
      }
    }
  }
}
