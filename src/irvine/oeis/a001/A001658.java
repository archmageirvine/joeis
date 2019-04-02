package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001658 Fibonomial coefficients.
 * @author Sean A. Irvine
 */
public class A001658 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();
  private Z mE = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.multiply(mA).multiply(mB).multiply(mC).multiply(mD).multiply(mE).divide(240);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = t;
    return r;
  }
}
