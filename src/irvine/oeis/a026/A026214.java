package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026214 a(n) = (1/2)*s(n), where s(n) is the n-th even number in A026177.
 * @author Sean A. Irvine
 */
public class A026214 extends A026177 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t.divide2();
  }
}
