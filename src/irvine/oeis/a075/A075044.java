package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075044 extends Sequence0 {

  private long mN = -1;

  private boolean is(final long k, final long n) {
    for (long j = 0; j < n; ++j) {
      final int t = Functions.OMEGA.i(k + j);
      if (t != n) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      if (is(++k, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

