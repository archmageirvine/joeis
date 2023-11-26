package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A066935 bigomega(n+1)==0 (mod bigomega(n)) where bigomega(n)=A001222(n) is the number of prime divisors of n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A066935 extends A001222 {

  {
    super.next(); // handle Omega(1)=0
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z b = mA;
      mA = super.next();
      if (mA.mod(b).isZero()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
