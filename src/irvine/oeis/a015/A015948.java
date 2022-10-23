package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015948 a(n) = smallest k &gt;= n such that k | (2^k + n).
 * @author Sean A. Irvine
 */
public class A015948 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      if (Z.TWO.modPow(k, k).equals(k.subtract(mN))) {
        return k;
      }
      k = k.add(1);
    }
  }
}
