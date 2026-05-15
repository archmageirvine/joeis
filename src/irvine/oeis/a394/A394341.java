package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394341 Minimum numerators corresponding to the denominators in A395144.
 * @author Sean A. Irvine
 */
public class A394341 extends Sequence1 {

  private Z mGlobalMaxDen = Z.ZERO;
  private long mDen = 1;

  @Override
  public Z next() {
    while (true) {
      ++mDen;
      long localMaxNum = 0;
      Z localMaxDen = Z.ZERO;
      for (long num = 1; num < mDen; ++num) {
        Q frac = new Q(num, mDen);
        while (!frac.num().isOne()) {
          frac = frac.subtract(new Q(1, frac.den().divide(frac.num()).add(1)));
        }
        if (frac.den().compareTo(localMaxDen) > 0) {
          localMaxNum = num;
          localMaxDen = frac.den();
        }
      }
      if (localMaxDen.compareTo(mGlobalMaxDen) > 0) {
        mGlobalMaxDen = localMaxDen;
        return Z.valueOf(localMaxNum);
      }
    }
  }
}
