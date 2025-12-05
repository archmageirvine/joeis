package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082378 Positive integers that can be written in exactly one way as the product ab of positive integers where a+b is composite.
 * @author Sean A. Irvine
 */
public class A082378 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long n) {
    int cnt = 0;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (d.square().compareTo(n) > 0) {
        break;
      }
      if (!d.add(n / d.longValue()).isProbablePrime() && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
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
