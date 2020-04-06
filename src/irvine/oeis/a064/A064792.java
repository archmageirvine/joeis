package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064792 Add more digits to n-th prime (zeros are permitted) until reach another prime.
 * @author Sean A. Irvine
 */
public class A064792 extends A000040 {

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = -1;
    while (true) {
      v += 2;
      if (v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 1; // to allow for leading 0s in what is appended
      }
      if (v % 5 != 0) {
        final Z u = t.add(v);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}

