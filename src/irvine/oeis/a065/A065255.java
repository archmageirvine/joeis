package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a072.A072566;

/**
 * A065255 Consider the sequence b(k) such that b(k) and sigma(b(k)) end with the same digit in base 10. Sequence gives values of n such that b(n)/n = 10.
 * @author Sean A. Irvine
 */
public class A065255 extends A072566 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z m = super.next();
      if (m.longValueExact() == 10 * mN) {
        return m;
      }
    }
  }
}
