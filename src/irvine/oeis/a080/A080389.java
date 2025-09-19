package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080389 Numbers n such that gcd( n+1, binomial(n, floor(n/2)) ) = 1.
 * @author Sean A. Irvine
 */
public class A080389 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Binomial.binomial(++mN, mN / 2).gcd(mN + 1).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
