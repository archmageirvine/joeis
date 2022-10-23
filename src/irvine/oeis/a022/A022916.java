package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022916 Multinomial coefficient n!/([n/3]![(n+1)/3]![(n+2)/3]!).
 * @author Sean A. Irvine
 */
public class A022916 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.multinomial(++mN, mN / 3, (mN + 1) / 3, (mN + 2) / 3);
  }
}
