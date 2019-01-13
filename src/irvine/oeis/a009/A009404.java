package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009404.
 * @author Sean A. Irvine
 */
public class A009404 implements Sequence {

  private Z mN = Z.SIX;

  private boolean isSquare(final Z v) {
    v.sqrt();
    return v.auxiliary() == 1;
  }

  private boolean isSquareDecomposable(final String s, final boolean multipart) {
    if (s.isEmpty()) {
      return multipart;
    }
    // Peel off a square from the left, end limit depends if we already have a part
    for (int k = 1; k <= (multipart ? s.length() : s.length() - 1); ++k) {
      final Z v = new Z(s.substring(0, k));
      if (isSquare(v) && isSquareDecomposable(s.substring(k), true)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (s.mod(10) != 0 && isSquareDecomposable(s.toString(), false)) {
        return s;
      }
    }
  }
}
