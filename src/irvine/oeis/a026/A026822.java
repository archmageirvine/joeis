package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A026822 CONTINUANT transform of Fibonacci number <code>1, 1, 2, 3, 5, 8, ..</code>.
 * @author Sean A. Irvine
 */
public class A026822 extends A000045 {

  private Z mA = super.next();
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next().multiply(mB).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
