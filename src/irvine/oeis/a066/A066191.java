package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066191 Numbers n such that the sum of the odd aliquot parts of n divides n.
 * @author Sean A. Irvine
 */
public class A066191 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    long s = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d != n && (d & 1) == 1) {
        s += d;
      }
    }
    return s != 0 && n % s == 0;
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
