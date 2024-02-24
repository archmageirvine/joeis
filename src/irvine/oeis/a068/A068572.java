package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068572 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      Z prod = Z.ONE;
      while (m != 0 && !prod.isZero()) {
        final long r = m % 10;
        m /= 10;
        prod = prod.multiply(r * r);
      }
      if (!prod.isZero() && Jaguar.factor(mN).sigma().equals(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
