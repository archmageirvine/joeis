package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A060781 a(n) = lcm(sigma(n+1), sigma(n)) = lcm(A000203(n+1), A000203(n)).
 * @author Sean A. Irvine
 */
public class A060781 extends A000203 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.lcm(mA);
  }
}
