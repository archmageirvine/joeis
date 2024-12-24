package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066160 Numbers k such that 4k-1 divides (2k-1)! - 1.
 * @author Sean A. Irvine
 */
public class A066160 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final long m = 4 * n - 1;
    long f = 1;
    for (long k = 2; k < 2 * n; ++k) {
      f *= k;
      f %= m;
    }
    return f == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
