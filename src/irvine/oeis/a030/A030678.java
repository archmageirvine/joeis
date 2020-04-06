package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A030678 Smallest nontrivial extension of n-th palindrome which is a cube.
 * @author Sean A. Irvine
 */
public class A030678 extends A002113 {

  {
    super.next();
  }

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

