package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071777.
 * @author Sean A. Irvine
 */
public class A071823 extends A071822 {

  private long mA = super.next().longValueExact();
  private Z mM = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      mM = mM.add(1);
    }
    return mM;
  }
}
