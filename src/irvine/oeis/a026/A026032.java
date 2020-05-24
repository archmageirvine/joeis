package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026032 <code>a(n) = C(3n,n) - C(3n,n-4)</code>.
 * @author Sean A. Irvine
 */
public class A026032 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN).subtract(Binomial.binomial(3 * mN, mN - 4));
  }
}

