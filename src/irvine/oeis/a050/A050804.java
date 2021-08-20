package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050804 Numbers n such that n^3 is the sum of two nonzero squares in exactly one way.
 * @author Sean A. Irvine
 */
public class A050804 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      long cnt = 0;
      for (long x = 1; true; ++x) {
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

