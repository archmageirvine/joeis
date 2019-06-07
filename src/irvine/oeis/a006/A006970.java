package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006970 Euler pseudoprimes: <code>2^((n-1)/2) == +- 1 mod n</code>.
 * @author Sean A. Irvine
 */
public class A006970 implements Sequence {

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
