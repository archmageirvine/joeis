package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A080733 Smallest distance from n to a squarefree number.
 * @author Sean A. Irvine
 */
public class A080733 extends A005117 {

  private long mA = 0;
  private long mB = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN >= mB) {
      mA = mB;
      mB = super.next().longValueExact();
    }
    return Z.valueOf(Math.min(mN - mA, mB - mN));
  }
}
