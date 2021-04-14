package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026259 a(n) = (1/2)*s(n), where s(n) is the n-th even number in A026255.
 * @author Sean A. Irvine
 */
public class A026259 extends A026255 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t.divide2();
  }
}
