package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084020 Numbers which are either a divisor or a multiple of their 9's complement.
 * @author Sean A. Irvine
 */
public class A084020 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long c = Functions.TENS_COMPLEMENT.l(++mN) - 1;
      if (c % mN == 0 || mN % c == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
