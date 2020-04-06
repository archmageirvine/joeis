package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030680 Smallest nontrivial extension of n-th palindromic prime which is a prime.
 * @author Sean A. Irvine
 */
public class A030680 extends A002385 {

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

