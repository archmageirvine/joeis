package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A386010 extends Sequence1 {

  private long mN = 119;

  @Override
  public Z next() {
    while (true) {
      final Z sz = Functions.SIGMA1.z(++mN);
      for (long y = 1; y <= mN; ++y) {
        final Z sx = sz.multiply(Functions.SIGMA1.z(y));
        for (long x = 1; x <= y; ++x) {
          final Z sy = sx.multiply(Functions.SIGMA1.z(x));
          if (sy.equals(Z.valueOf(mN + y + x).pow(3))) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
