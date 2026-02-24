package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076748 Smallest k such that k*n+1 is a base-2 pseudoprime.
 * @author Sean A. Irvine
 */
public class A076748 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z u = mN.multiply(++k);
      final Z t = u.add(1);
      if (!t.isProbablePrime() && Z.TWO.modPow(u, t).isOne()) {
        return Z.valueOf(k);
      }
    }
  }
}
