package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001511 The ruler function: <code>2^a(n)</code> divides <code>2n</code>. Or, <code>a(n) = 2-adic</code> valuation of <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A001511 extends A000120 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return Z.TWO.add(t).subtract(mA);
  }
}
