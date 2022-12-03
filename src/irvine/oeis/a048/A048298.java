package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048298 a(n) = n if n=2^i for i &gt;= 0, otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A048298 extends Sequence0 {

  private long mN = -1;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 2;
      return Z.valueOf(mN);
    }
    return Z.ZERO;
  }
}
