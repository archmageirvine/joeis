package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a077.A077202;

/**
 * A082238 Primes pertaining to A077202. a(n) = concatenation A077202(n), A077202(n+1).
 * @author Sean A. Irvine
 */
public class A082238 extends A077202 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return new Z(t.toString() + mA);
  }
}
