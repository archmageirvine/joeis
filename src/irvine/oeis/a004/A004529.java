package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004529 Ratios of successive terms are 1,1,1,2,3,3,3,4,5,5,5,6,...
 * @author Sean A. Irvine
 */
public class A004529 extends A004525 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.signum() > 0) {
      mN = mN.multiply(t);
    }
    return mN;
  }
}
