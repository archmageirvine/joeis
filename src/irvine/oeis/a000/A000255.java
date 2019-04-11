package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000255 <code>a(n) = n * a(n-1) + (n-1) * a(n-2), a(0) = 1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A000255 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z t = mB.multiply(mN).add(mA.multiply(mN - 1));
    mA = mB;
    mB = t;
    return t;
  }
}
