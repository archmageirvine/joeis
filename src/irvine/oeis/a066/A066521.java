package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
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
      final long dp = ZUtils.digitProduct(++mN);
      if (dp != 0 && ZUtils.digitProduct(p).equals(Z.valueOf(dp))) {
        return p;
      }
    }
  }
}
