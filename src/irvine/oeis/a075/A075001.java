package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075001 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    long lim = 10;
    while (true) {
      if (++s == lim) {
        lim *= 10;
      }
      long t = s;
      long tlim = lim;
      Z concat = Z.ZERO;
      for (long k = 0; k < mN; ++k) {
        concat = concat.multiply(tlim).add(t);
        if (++t == tlim) {
          tlim *= 10;
        }
      }
      if (concat.mod(mN) == 0) {
        return Z.valueOf(s);
      }
    }
  }
}

