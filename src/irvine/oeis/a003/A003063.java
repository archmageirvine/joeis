package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003063 <code>a(n) = 3^(n-1)-2^n</code>.
 * @author Sean A. Irvine
 */
public class A003063 implements Sequence {

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
