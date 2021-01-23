package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034377 Squares that remain a square if a suitably chosen digit is dropped.
 * @author Sean A. Irvine
 */
public class A034377 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean isDropSquare(final Z square) {
    final String s = square.toString();
    if (s.length() == 1) {
      return true; // becomes 0
    }
    for (int k = 0; k < s.length(); ++k) {
      if (new Z(s.substring(0, k) + s.substring(k + 1)).isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (isDropSquare(square)) {
        return square;
      }
    }
  }
}
