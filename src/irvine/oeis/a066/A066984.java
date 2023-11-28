package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066984 a(n) = gcd(prime(n+1) - 1, prime(n) + 1).
 * @author Sean A. Irvine
 */
public class A066984 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP.add(1);
    mP = super.next();
    return mP.subtract(1).gcd(q);
  }
}
