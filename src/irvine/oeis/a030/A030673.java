package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030673 Smallest cube that begins with n-th prime.
 * @author Sean A. Irvine
 */
public class A030673 extends A000040 {

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = -1;
    while (true) {
      if (++v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
      }
      final Z u = t.add(v);
      u.root(3);
      if (u.auxiliary() == 1) {
        return u;
      }
    }
  }
}

