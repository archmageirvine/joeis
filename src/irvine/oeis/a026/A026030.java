package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026030 a(n) = T(2n,n-1), where T is defined in A026022.
 * @author Sean A. Irvine
 */
public class A026030 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 1).subtract(Binomial.binomial(2 * mN, mN - 5));
  }
}

