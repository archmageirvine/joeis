package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A011974.
 * @author Sean A. Irvine
 */
public class A011974 extends A000040 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA);
  }
}
