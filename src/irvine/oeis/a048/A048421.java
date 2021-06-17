package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A048421 Squares composed of two '1-digit' overlapping subsquares.
 * @author Sean A. Irvine
 */
public class A048421 extends A000290 {

  protected int overlap() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z sq = super.next();
      if (sq.mod(10) != 0) {
        final String s = sq.toString();
        for (int k = 1; k < s.length() - overlap(); ++k) {
          if (s.charAt(k) != '0' && s.charAt(k + overlap() - 1) != '0') {
            final Z left = new Z(s.substring(0, k + overlap()));
            if (left.isSquare() && new Z(s.substring(k)).isSquare()) {
              return sq;
            }
          }
        }
      }
    }
  }
}
