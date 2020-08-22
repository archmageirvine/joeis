package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025219 a(n) = [ 2nd elementary symmetric function of {sqrt(k+1)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025219 implements Sequence {

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN);
    for (long k = 2; k < mN; ++k) {
      mSum = mSum.add(CR.valueOf(s.multiply(k)).sqrt());
    }
    return mSum.floor();
  }
}
