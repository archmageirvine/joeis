package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061764 Positive integers k such that k! is divisible by (k+1)^12.
 * @author Sean A. Irvine
 */
public class A061764 extends Sequence1 {

  private long mN = 58;

  @Override
  public Z next() {
    while (true) {
      final Z d = Z.valueOf(++mN + 1).pow(12);
      Z f = Z.ONE;
      for (long k = 2; k <= mN; ++k) {
        f = f.modMultiply(k, d);
      }
      if (f.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
