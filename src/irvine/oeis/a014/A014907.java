package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014907 a(1)=1, a(n) = 22*a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A014907 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(22).add(mN);
    }
    return mA;
  }
}
