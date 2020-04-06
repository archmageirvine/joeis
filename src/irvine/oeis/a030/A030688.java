package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A030688 Smallest nontrivial extension of n-th square which is a square not ending 00.
 * @author Sean A. Irvine
 */
public class A030688 extends A000290 {

  private long[] STEPS = {1, 1, 3, 1, 1, 3};
  {
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = 0;
    int s = 0;
    while (true) {
      if (++s == STEPS.length) {
        s = 0;
      }
      v += STEPS[s];
      if (v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 1; // to allow for leading 0s in what is appended
        s = 1;
      }
      final Z u = t.add(v);
      if (u.isSquare()) {
        return u;
      }
    }
  }
}

