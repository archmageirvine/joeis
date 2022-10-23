package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014903 a(1)=1, a(n) = 19*a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A014903 extends Sequence1 {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(19).add(mN);
    }
    return mA;
  }
}
