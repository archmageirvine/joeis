package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001656 Fibonomial coefficients.
 * @author Sean A. Irvine
 */
public class A001656 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.multiply(mA).multiply(mB).multiply(mC).divide(6);
    mA = mB;
    mB = mC;
    mC = t;
    return r;
  }
}
