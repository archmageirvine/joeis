package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050800 Values of n^2 + 1 resulting from A050796.
 * @author Sean A. Irvine
 */
public class A050800 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.TWO;
      }
      final Z t = Z.valueOf(mN).square().add(1);
      for (long x = 2; x < mN; ++x) {
        final Z y2 = t.subtract(Z.valueOf(x).square());
        if (y2.isSquare()) {
          return t;
        }
      }
    }
  }
}

