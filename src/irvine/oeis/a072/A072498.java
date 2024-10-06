package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072498 extends Sequence1 {

  private long mN = 3;

  static boolean is(final long n) {
    long prod = 1;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      prod *= d.longValueExact();
      if (prod == n) {
        return false;
      }
      if (prod > n) {
        return true;
      }
    }
    return true;
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

