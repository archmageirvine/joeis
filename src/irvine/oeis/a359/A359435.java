package irvine.oeis.a359;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A359435 a(n) = binomial(2*n-1,n) - n^2 - 1.
 * @author Sean A. Irvine
 */
public class A359435 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN - 1, mN).subtract(mN * mN + 1);
  }
}
