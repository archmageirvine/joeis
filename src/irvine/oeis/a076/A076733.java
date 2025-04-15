package irvine.oeis.a076;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076733 Largest k such that k! divides C(2n,n).
 * @author Sean A. Irvine
 */
public class A076733 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z b = Binomial.binomial(2 * ++mN, mN);
    long k = 1;
    while (true) {
      final Z[] qr = b.divideAndRemainder(++k);
      if (!qr[1].isZero()) {
        return Z.valueOf(k - 1);
      }
      b = qr[0];
    }
  }
}
