package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026030 <code>a(n) = T(2n,n-1)</code>, where T is defined in <code>A026022</code>.
 * @author Sean A. Irvine
 */
public class A026030 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 1).subtract(Binomial.binomial(2 * mN, mN - 5));
  }
}

