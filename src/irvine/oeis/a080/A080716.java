package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080688.
 * @author Sean A. Irvine
 */
public class A080716 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    Z s = Z.ZERO;
    Z t = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      s = s.add(d);
      t = t.add(Functions.REVERSE.z(d));
    }
    return s.equals(t);
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
