package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026021 T(n,[ n/2 ]), where T is the array defined in A026009.
 * @author Sean A. Irvine
 */
public class A026021 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).subtract(Binomial.binomial(mN, mN / 2 - 3));
  }
}

