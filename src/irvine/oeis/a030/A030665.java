package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030665 Smallest nontrivial extension of n which is prime.
 * @author Sean A. Irvine
 */
public class A030665 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).multiply(10);
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

