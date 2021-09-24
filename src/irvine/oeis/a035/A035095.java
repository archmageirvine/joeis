package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A035095 Smallest prime congruent to 1 (mod prime(n)).
 * @author Sean A. Irvine
 */
public class A035095 extends A000040 {

  @Override
  public Z next() {
    final Z mod = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Z.ONE.equals(p.mod(mod))) {
        return p;
      }
    }
  }
}
