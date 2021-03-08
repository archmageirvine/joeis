package irvine.oeis.a042;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042971 a(n) = (C(2n, n)/2 - (2^(n-1) + ((n+1) mod 2)*C(n-1, n/2-1)))/2.
 * @author Sean A. Irvine
 */
public class A042971 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ONE.shiftLeft(mN);
    if ((++mN & 1) == 0) {
      s = s.add(Binomial.binomial(mN - 1, mN / 2 - 1));
    }
    return Binomial.binomial(2 * mN, mN).divide2().subtract(s).divide2();
  }
}
