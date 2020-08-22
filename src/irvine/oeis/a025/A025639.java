package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025639 Exponent of 2 (value of i) in n-th number of form 2^i*10^j.
 * @author Sean A. Irvine
 */
public class A025639 extends A025612 {

  @Override
  public Z next() {
    final Z r = super.next();
    Z t = r.makeOdd();
    long c = r.auxiliary();
    while (!Z.ONE.equals(t)) {
      t = t.divide(5);
      --c;
    }
    return Z.valueOf(c);
  }
}
