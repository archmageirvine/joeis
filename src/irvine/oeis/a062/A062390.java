package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062390 Numbers k such that (k + R(k)) / (k - R(k)) = +-11 where R(k) is the digit reversal of k (A004086).
 * @author Sean A. Irvine
 */
public class A062390 extends Sequence1 {

  private long mN = 44;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      final long s = mN + r;
      final long d = mN - r;
      if (d != 0 && s % d == 0 && Math.abs(s / d) == 11) {
        return Z.valueOf(mN);
      }
    }
  }
}
