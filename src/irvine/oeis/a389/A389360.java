package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A389360 allocated for Stijn Cambie.
 * @author Sean A. Irvine
 */
public class A389360 extends Sequence2 {

  private long mN = 1;

  private boolean is(final Z b, final long m, final long n) {
    int fails = 0;
    for (long k = 0; k < n; ++k) {
      if (b.mod(m - k) != 0 && ++fails > 1) {
        return false;
      }
    }
    return fails == 1;
  }

  @Override
  public Z next() {
    long m = 2 * ++mN;
    while (true) {
      if (is(Binomial.binomial(m, mN), m, mN)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
