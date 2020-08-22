package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026194 a(n) = (1/4)*s(n), where s(n) is the n-th multiple of 4 in A026142.
 * @author Sean A. Irvine
 */
public class A026194 extends A026142 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(4) != 0);
    return t.divide(4);
  }
}
