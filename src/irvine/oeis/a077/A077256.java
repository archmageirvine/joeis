package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077256 Primes p such that p^k == 1 modulo k, where p=prime(k).
 * @author Sean A. Irvine
 */
public class A077256 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = super.next();
      if (p.modPow(mN, mN).isOne()) {
        return p;
      }
    }
  }
}
