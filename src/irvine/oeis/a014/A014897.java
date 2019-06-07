package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014897 <code>a(1)=1, a(n) = 14*a(n-1) + n</code>.
 * @author Sean A. Irvine
 */
public class A014897 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(14).add(mN);
    }
    return mA;
  }
}
