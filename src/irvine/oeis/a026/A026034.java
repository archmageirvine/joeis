package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026034 T(n,[ n/2 ]), where T is defined in A026022.
 * @author Sean A. Irvine
 */
public class A026034 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).subtract(Binomial.binomial(mN, mN / 2 - 4));
  }
}

