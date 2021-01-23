package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037167 Prime(n)*prime(n+1)-prime(n+1).
 * @author Sean A. Irvine
 */
public class A037167 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    return t.multiply(mP).subtract(mP);
  }
}
