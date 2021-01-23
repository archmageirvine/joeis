package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025220 [ 3rd elementary symmetric function of {sqrt(k+1)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025220 implements Sequence {

  private long mN = 3;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN);
    for (long k = 3; k < mN; ++k) {
      final Z t = s.multiply(k);
      for (long j = 2; j < k; ++j) {
        mSum = mSum.add(CR.valueOf(t.multiply(j)).sqrt());
      }
    }
    return mSum.floor();
  }
}
