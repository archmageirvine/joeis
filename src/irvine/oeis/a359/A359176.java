package irvine.oeis.a359;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359176 a(n) = binomial(2*n-2,n-1) - n.
 * @author Sean A. Irvine
 */
public class A359176 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN - 2, mN - 1).subtract(mN);
  }
}
