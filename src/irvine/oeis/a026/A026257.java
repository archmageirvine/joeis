package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026257 a(n) = (1/2)*(s(n) + 1), where s(n) is the n-th odd number in A026255.
 * @author Sean A. Irvine
 */
public class A026257 extends A026255 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}
