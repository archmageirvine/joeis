package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054874 a(n) = 2^(sum of a(i) where i&lt;n).
 * @author Sean A. Irvine
 */
public class A054874 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = Z.ONE.shiftLeft(mA.intValueExact());
    mA = t.add(mA);
    return t;
  }
}
