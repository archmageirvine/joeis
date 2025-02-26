package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075540.
 * @author Sean A. Irvine
 */
public class A075559 extends Sequence1 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    long k = mN;
    while (true) {
      k += mN;
      if (k % mM == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

