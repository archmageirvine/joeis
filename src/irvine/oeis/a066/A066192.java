package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A066192 Composite numbers k such that the sum of the odd aliquot parts of k divides k.
 * @author Sean A. Irvine
 */
public class A066192 extends A002808 {

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
      final Z n = super.next();
      if (is(n.longValueExact())) {
        return n;
      }
    }
  }
}
