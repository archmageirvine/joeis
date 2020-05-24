package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026019 <code>a(n) = binomial(3*n,n) - binomial(3*n,n-3)</code>.
 * @author Sean A. Irvine
 */
public class A026019 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN).subtract(Binomial.binomial(3 * mN, mN - 3));
  }
}

