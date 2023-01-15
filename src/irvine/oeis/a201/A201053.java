package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A201053 Nearest cube.
 * @author Sean A. Irvine
 */
public class A201053 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long c = Z.valueOf(++mN).root(3).longValue();
    final long c3 = c * c * c;
    final long t3 = (c + 1) * (c + 1) * (c + 1);
    return Z.valueOf(Math.abs(c3 - mN) < Math.abs(mN - t3) ? c3 : t3);
  }
}

