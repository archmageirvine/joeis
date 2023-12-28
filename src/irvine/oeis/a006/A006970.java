package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006970 Euler pseudoprimes: composite numbers n such that 2^((n-1)/2) == +-1 (mod n).
 * @author Sean A. Irvine
 */
public class A006970 extends Sequence1 {

  private Z mN = Z.valueOf(339);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z m = mN.subtract(1);
      final Z res = Z.TWO.modPow(m.divide2(), mN);
      if ((Z.ONE.equals(res) || m.equals(res)) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
