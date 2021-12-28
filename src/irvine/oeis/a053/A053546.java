package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A053546 Smallest prime containing a leading sequence of n ascending numbers.
 * @author Sean A. Irvine
 */
public class A053546 extends A007908 {

  @Override
  public Z next() {
    Z t = super.next();
    long k = 0;
    long lim = 1;
    while (true) {
      if (++k == lim) {
        lim *= 10;
        t = t.multiply(10);
        k = 0;
      }
      final Z a = t.add(k);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
