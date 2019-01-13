package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004528.
 * @author Sean A. Irvine
 */
public class A004528 extends A004524 {

  private Z mN = Z.ONE;

  {
    super.next();
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
