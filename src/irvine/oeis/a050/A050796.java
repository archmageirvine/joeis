package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050796 Numbers n such that n^2 + 1 is expressible as the sum of two nonzero squares in at least one way (the trivial solution n^2 + 1 = n^2 + 1^2 is not counted).
 * @author Sean A. Irvine
 */
public class A050796 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z t = Z.valueOf(mN).square().add(1);
      for (long x = 2; x < mN; ++x) {
        final Z y2 = t.subtract(Z.valueOf(x).square());
        if (y2.isSquare()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

