package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050803 Cubes expressible as the sum of two nonzero squares in at least one way.
 * @author Sean A. Irvine
 */
public class A050803 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      for (long x = 1; true; ++x) {
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

