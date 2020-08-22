package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001511 The ruler function: 2^a(n) divides 2n. Or, a(n) = 2-adic valuation of 2n.
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
