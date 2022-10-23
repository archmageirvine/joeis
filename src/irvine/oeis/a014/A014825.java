package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014825 a(n) = 4*a(n-1) + n with n &gt; 1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A014825 extends Sequence1 {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(4).add(mN);
    }
    return mA;
  }
}
