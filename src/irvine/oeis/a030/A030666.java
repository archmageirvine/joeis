package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030666 Smallest nontrivial extension of n which is a square.
 * @author Sean A. Irvine
 */
public class A030666 extends Sequence1 {

  private static final long[] STEPS = {1, 1, 3, 1, 1, 3};
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).multiply(10);
    long lim = 10;
    long v = -1;
    int s = -1;
    while (true) {
      if (++s == STEPS.length) {
        s = 0;
      }
      v += STEPS[s];
      if (v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
        s = 0;
      }
      final Z u = t.add(v);
      if (u.isSquare()) {
        return u;
      }
    }
  }
}

