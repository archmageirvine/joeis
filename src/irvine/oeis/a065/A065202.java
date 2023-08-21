package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065202 Characteristic function of A065201: a(n) = if A065201(k) = n for some k then 1 else 0.
 * @author Sean A. Irvine
 */
public class A065202 extends A065200 {

  private Z mN = Z.ZERO;
  private Z mM = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mM.equals(mN)) {
      mM = super.next();
      return Z.ZERO;
    } else {
      return Z.ONE;
    }
  }
}
