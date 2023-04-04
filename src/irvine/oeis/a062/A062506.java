package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062506 n divisible by at least one twin prime (A001097).
 * @author Sean A. Irvine
 */
public class A062506 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long n) {
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (p.subtract(2).isProbablePrime() || p.add(2).isProbablePrime()) {
        return true;
      }
    }
    return false;
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
