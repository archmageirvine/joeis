package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A113873 a(3n) = a(3n-1) + a(3n-2), a(3n+1) = 2n*a(3n) + a(3n-1), a(3n+2) = a(3n+1) + a(3n).
 * @author Sean A. Irvine
 */
public class A113873 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB.multiply(++mN % 3 == 1 ? 2 * (mN / 3) : 1));
    mA = mB;
    mB = t;
    return t;
  }
}
