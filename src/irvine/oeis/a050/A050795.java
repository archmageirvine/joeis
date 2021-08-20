package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050795 Numbers n such that n^2 - 1 is expressible as the sum of two nonzero squares in at least one way.
 * @author Sean A. Irvine
 */
public class A050795 implements Sequence {

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
          return Z.valueOf(mN);
        }
      }
    }
  }
}

