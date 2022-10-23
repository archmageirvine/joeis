package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039686 Squares which are the concatenation of two nonzero squares.
 * @author Sean A. Irvine
 */
public class A039686 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      for (Z t = Z.TEN; t.compareTo(s) < 0; t = t.multiply(10)) {
        final Z[] qr = s.divideAndRemainder(t);
        if (qr[1].multiply(10).compareTo(t) >= 0 && qr[1].isSquare() && qr[0].isSquare()) {
          return s;
        }
      }
    }
  }
}
