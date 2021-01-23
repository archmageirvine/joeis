package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003595;

/**
 * A025667 Exponent of 7 (value of j) in n-th number of form 5^i*7^j.
 * @author Sean A. Irvine
 */
public class A025667 extends A003595 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
