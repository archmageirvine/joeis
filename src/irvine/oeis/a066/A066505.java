package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066505 f-amicable numbers where f(n) = n+1.
 * @author Sean A. Irvine
 */
public class A066505 extends Sequence1 {

  private Z mN = Z.ONE;

  protected Z f(final Z n) {
    return n.add(1);
  }

  protected Z fInverse(final Z n) {
    return n.subtract(1);
  }

  private Z d(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.equals(n)) {
        sum = sum.add(f(d));
      }
    }
    return sum;
  }

  private boolean isAmicable(final Z n) {
    final Z f = f(n);
    final Z m = d(n);
    if (m.equals(f)) {
      return false; // f-perfect
    }
    final Z r = d(fInverse(m));
    return r.equals(f);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isAmicable(mN)) {
        return mN;
      }
    }
  }
}
