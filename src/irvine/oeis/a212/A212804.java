package irvine.oeis.a212;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A212804 Expansion of (1 - x)/(1 - x - x^2).
 * @author Sean A. Irvine
 */
public class A212804 extends A000045 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}

