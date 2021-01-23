package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026236 a(n) = (s(n) + 1)/2, where s(n) is the n-th odd number in A026234.
 * @author Sean A. Irvine
 */
public class A026236 extends A026234 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}
