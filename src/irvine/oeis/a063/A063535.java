package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063535 Primes prime(n) such that prime(n+1)^2 &lt; prime(n)*prime(n+2).
 * @author Sean A. Irvine
 */
public class A063535 extends A000040 {

  private Z mP = super.next();
  private Z mQ = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = mQ;
      mQ = super.next();
      if (mP.square().compareTo(t.multiply(mQ)) < 0) {
        return t;
      }
    }
  }
}
