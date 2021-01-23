package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037165 a(n) = prime(n)*prime(n+1) - prime(n) - prime(n+1).
 * @author Sean A. Irvine
 */
public class A037165 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    return t.multiply(mP).subtract(t).subtract(mP);
  }
}
