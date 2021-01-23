package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A025664 Exponent of 7 (value of j) in n-th number of form 2^i*7^j.
 * @author Sean A. Irvine
 */
public class A025664 extends A003591 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
