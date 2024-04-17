package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064548 Numbers n for which the sum of the binary digits (or count of 1-bits) equals the sum of the prime exponents of n+1 (or the factor-count of n+1).
 * @author Sean A. Irvine
 */
public class A064548 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN + 1) == Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

