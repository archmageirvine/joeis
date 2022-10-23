package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050799 Values of n^2 - 1 resulting from A050795.
 * @author Sean A. Irvine
 */
public class A050799 extends Sequence0 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      for (long x = 2; x < mN; ++x) {
        final Z x2 = Z.valueOf(x).square();
        final Z y2 = t.subtract(x2);
        if (y2.compareTo(x2) < 0) {
          break;
        }
        if (y2.isSquare()) {
          return t;
        }
      }
    }
  }
}

