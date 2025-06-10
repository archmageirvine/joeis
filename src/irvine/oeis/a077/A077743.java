package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077743 Smallest cube ending in n, or 0 if no such cube exists.
 * @author Sean A. Irvine
 */
public class A077743 extends Sequence1 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    for (long m = 1; m < mM; ++m) {
      final Z t = Z.valueOf(m).pow(3);
      final long r = t.mod(mM);
      if (r == mN) {
        return t;
      }
    }
    return Z.ZERO;
  }
}
