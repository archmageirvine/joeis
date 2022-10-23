package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A000304 a(n) = a(n-1)*a(n-2).
 * @author Sean A. Irvine
 */
public class A000304 extends Sequence2 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    final Z t = mB == null ? Z.TWO : mA == null ? Z.THREE : mA.multiply(mB);
    mA = mB;
    mB = t;
    return t;
  }

}

