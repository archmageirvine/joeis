package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050797 Numbers n such that n^2 - 1 is expressible as the sum of two nonzero squares in exactly one way.
 * @author Sean A. Irvine
 */
public class A050797 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      int cnt = 0;
      for (long x = 2; x < mN; ++x) {
        final Z x2 = Z.valueOf(x).square();
        final Z y2 = t.subtract(x2);
        if (y2.compareTo(x2) < 0) {
          break;
        }
        if (y2.isSquare() && ++cnt > 1) {
          break;
        }
      }
      if (cnt == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

