package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A053547 Smallest prime starting with A000422(n).
 * @author Sean A. Irvine
 */
public class A053547 extends A000422 {

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
