package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A011968 Apply (1+Shift) to Bell numbers.
 * @author Sean A. Irvine
 */
public class A011968 extends A000110 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
