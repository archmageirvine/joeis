package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006680.
 * @author Sean A. Irvine
 */
public class A006680 implements Sequence {

  private int mN = 1;
  private Z mA = Z.ONE;
  private final A006678 mP = new A006678();
  {
    mP.next();
  }
  private Z mP1 = mP.next();

  @Override
  public Z next() {
    if (++mN > 2) {
      final Z p0 = mP1;
      mP1 = mP.next();
      mA = mP1.add(p0.multiply(2L * (mN - 1))).subtract(mA.multiply(mN + 1));
    }
    return mA;
  }
}
