package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027412 <code>a(n) = 2*a(n-1) + (n-2)*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A027412 implements Sequence {

  private long mN = -3;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > -2) {
      final Z t = mB.multiply2().add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
