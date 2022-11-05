package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A048425 Squares composed of three overlapping subsquares, which overlap by one digit.
 * @author Sean A. Irvine
 */
public class A048425 extends A000290 {

  {
    setOffset(1);
  }

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
            if (left.isSquare()) {
              for (int j = k + 1; j < s.length() - overlap(); ++j) {
                if (s.charAt(j) != '0' && s.charAt(j + overlap() - 1) != '0') {
                  final Z mid = new Z(s.substring(k, j + overlap()));
                  if (mid.isSquare() && new Z(s.substring(j)).isSquare()) {
                    return sq;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
