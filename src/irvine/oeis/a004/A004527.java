package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004527 Ratios of successive terms are 1,2,2,3,4,4,5,6,6,...
 * @author Sean A. Irvine
 */
public class A004527 extends A004523 {

  private Z mN = Z.ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.signum() > 0) {
      mN = mN.multiply(t);
    }
    return mN;
  }
}
