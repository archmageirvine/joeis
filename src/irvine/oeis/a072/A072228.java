package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072228 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d != n) {
        s += Functions.REVERSE.l(d);
      }
    }
    return mN == s;
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
