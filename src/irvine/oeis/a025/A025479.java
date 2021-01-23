package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A025479 Largest exponents of perfect powers (A001597).
 * @author Sean A. Irvine
 */
public class A025479 extends A001597 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.isPower();
    return Z.valueOf(t.auxiliary()).max(Z.TWO);
  }
}

