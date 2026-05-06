package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395144 allocated for Hoang Nguyen.
 * @author Sean A. Irvine
 */
public class A395144 extends Sequence1 {

  private Z mGlobalMax = Z.ZERO;
  private long mDen = 1;

  @Override
  public Z next() {
    while (true) {
      ++mDen;
      Z localMax = Z.ZERO;
      for (long num = 1; num < mDen; ++num) {
        Q frac = new Q(num, mDen);
        while (!frac.num().isOne()) {
          frac = frac.subtract(new Q(1, frac.den().divide(frac.num()).add(1)));
        }
        if (frac.den().compareTo(localMax) > 0) {
          localMax = frac.den();
        }
      }
      if (localMax.compareTo(mGlobalMax) > 0) {
        mGlobalMax = localMax;
        return Z.valueOf(mDen);
      }
    }
  }
}
