package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001657 Fibonomial coefficients: column 5 of <code>A010048</code>.
 * @author Sean A. Irvine
 */
public class A001657 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.multiply(mA).multiply(mB).multiply(mC).multiply(mD).divide(30);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return r;
  }
}
