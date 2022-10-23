package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003063 a(n) = 3^(n-1)-2^n.
 * @author Sean A. Irvine
 */
public class A003063 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mA.subtract(mB);
    mA = mA.multiply(3);
    mB = mB.multiply2();
    return t;
  }
}
