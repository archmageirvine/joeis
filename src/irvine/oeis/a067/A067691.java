package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067691 a(n) = (a(n-1) + 1)^(n-1) for n &gt; 0, a(0) = 0.
 * @author Sean A. Irvine
 */
public class A067691 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.add(1).pow(mN);
    }
    return mA;
  }
}
