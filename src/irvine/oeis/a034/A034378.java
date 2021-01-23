package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034378 Squares and omitting some digit gives another number in this list.
 * @author Sean A. Irvine
 */
public class A034378 extends MemorySequence {

  private Z mN = Z.NEG_ONE;

  private boolean isDropSquare(final Z square) {
    final String s = square.toString();
    if (s.length() == 1) {
      return true; // becomes 0
    }
    for (int k = 0; k < s.length(); ++k) {
      if (contains(new Z(s.substring(0, k) + s.substring(k + 1)))) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (isDropSquare(square)) {
        return square;
      }
    }
  }
}
