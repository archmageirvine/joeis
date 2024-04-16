package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066521 Primes p(k) such that the product of digits of p(k) equals the product of digits of k.
 * @author Sean A. Irvine
 */
public class A066521 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long v = ++mN;
      final long dp = Functions.DIGIT_PRODUCT.l(v);
      if (dp != 0 && Functions.DIGIT_PRODUCT.z(p).equals(dp)) {
        return p;
      }
    }
  }
}
