package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014901 a(1)=1, a(n) = 18*a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A014901 extends Sequence1 {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(18).add(mN);
    }
    return mA;
  }
}
