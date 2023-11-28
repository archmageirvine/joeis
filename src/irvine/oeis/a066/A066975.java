package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066975 a(n) = gcd(binomial(2n,n), 2^n + 1).
 * @author Sean A. Irvine
 */
public class A066975 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).gcd(Z.ONE.shiftLeft(mN).add(1));
  }
}
