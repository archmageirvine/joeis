package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025221 <code>[ 4th</code> elementary symmetric function of <code>sqrt(k+1) ], k = 1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A025221 implements Sequence {

  private long mN = 4;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN);
    for (long k = 4; k < mN; ++k) {
      final Z t = s.multiply(k);
      for (long j = 3; j < k; ++j) {
        final Z u = t.multiply(j);
        for (long i = 2; i < j; ++i) {
          mSum = mSum.add(CR.valueOf(u.multiply(i)).sqrt());
        }
      }
    }
    return mSum.floor();
  }
}
