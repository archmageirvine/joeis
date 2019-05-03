package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005773 Number of directed animals of size <code>n (or</code> directed n-ominoes in standard <code>position)</code>.
 * @author Sean A. Irvine
 */
public class A005773 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(mN).multiply2().add(mA.multiply(mN - 2).multiply(3)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
