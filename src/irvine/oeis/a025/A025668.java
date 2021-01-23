package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025668 Exponent of 7 (value of j) in n-th number of form 6^i*7^j.
 * @author Sean A. Irvine
 */
public class A025668 extends A025626 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
