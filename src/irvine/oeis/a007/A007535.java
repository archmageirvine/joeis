package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007535 Smallest pseudoprime ( &gt; n ) to base n: smallest composite number m &gt; n such that n^(m-1)-1 is divisible by m.
 * @author Sean A. Irvine
 */
public class A007535 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (true) {
      final Z e = m;
      m = m.add(1);
      if (Z.ONE.equals(mN.modPow(e, m))) {
        if (!m.isPrime()) {
          return m;
        }
      }
    }
  }
}
