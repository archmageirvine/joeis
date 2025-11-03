package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386620 allocated for Giorgos Kalogeropoulos.
 * @author Sean A. Irvine
 */
public class A386620 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long k) {
    for (long j = 1; j <= mN; ++j) {
      final long t = k - j;
      if (t > mN) {
        for (final Z pp : Jaguar.factor(t).toZArray()) {
          final long p = pp.longValue();
          if (p > mN && p < 2 * mN) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2 * mN;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
