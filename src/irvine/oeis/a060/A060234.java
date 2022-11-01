package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060234 a(n) = (prime(n) mod (prime(n+1)-prime(n))).
 * @author Sean A. Irvine
 */
public class A060234 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    return q.mod(mP.subtract(q));
  }
}
