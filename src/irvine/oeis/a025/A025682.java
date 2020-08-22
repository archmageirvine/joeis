package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025682 Exponent of 9 (value of j) in n-th number of form 8^i*9^j.
 * @author Sean A. Irvine
 */
public class A025682 extends A025633 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
