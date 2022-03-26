package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000257 Number of rooted bicubic maps: a(n) = (8*n-4)*a(n-1)/(n+2) for n &gt;= 2, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A000257 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(8 * mN - 4).divide(mN + 2);
    }
    return mA;
  }
}
