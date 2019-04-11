package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000340 <code>a(0)=1, a(n) = 3*a(n-1) + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A000340 implements Sequence {

  protected long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(3).add(++mN);
    return mA;
  }
}
