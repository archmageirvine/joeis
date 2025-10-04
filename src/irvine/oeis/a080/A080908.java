package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080908 a(n) = the sign of r(n), where r(n) is the integer in [ -2n,2n] which is congruent to (2n)! modulo 4n+1.
 * @author Sean A. Irvine
 */
public class A080908 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long m = 4 * mN + 1;
    long f = 1;
    for (long k = 1; k <= 2 * mN; ++k) {
      f *= k;
      f %= m;
    }
    if (f == 0) {
      return Z.ZERO;
    }
    return Z.valueOf(f <= 2 * mN ? 1 : -1);
  }
}

