package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080236 Triangle of differences of consecutive pairs of row elements of triangle A080233.
 * @author Sean A. Irvine
 */
public class A080236 extends A080233 {

  private Z mA = Z.ZERO;
  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mA = Z.ZERO;
    }
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}

