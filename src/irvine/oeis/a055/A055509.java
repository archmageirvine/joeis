package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055509 Number of odd primes in sequence obtained in 3x+1 (or Collatz) problem starting at n.
 * @author Sean A. Irvine
 */
public class A055509 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z m = mN.makeOdd();
    while (!Z.ONE.equals(m)) {
      if (m.isProbablePrime()) {
        ++cnt;
      }
      m = m.multiply(3).add(1).makeOdd();
    }
    return Z.valueOf(cnt);
  }
}
