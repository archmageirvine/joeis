package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000257 Number of rooted bicubic maps: <code>a(n) = (8n-4)*a(n-1)/(n+2)</code>.
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
