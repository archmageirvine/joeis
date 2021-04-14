package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026253 a(n) = (1/2)*s(n), where s(n) is the n-th even number in A026250. Also a(n) = position of n in A026253.
 * @author Sean A. Irvine
 */
public class A026253 extends A026250 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t.divide2();
  }
}
