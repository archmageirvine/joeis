package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025193 a(n) = [ 2nd elementary symmetric function of {sqrt(k)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025193 implements Sequence {

  protected long mN = 1;
  protected CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR sk = CR.valueOf(++mN).sqrt();
    for (long j = 1; j < mN; ++j) {
      mSum = mSum.add(sk.multiply(CR.valueOf(j).sqrt()));
    }
    return mSum.floor();
  }
}
