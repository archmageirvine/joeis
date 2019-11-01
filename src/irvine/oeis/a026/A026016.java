package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026016 <code>a(n) = binomial(2*n-1, n) - binomial(2*n-1, n+3)</code>.
 * @author Sean A. Irvine
 */
public class A026016 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN - 1, mN).subtract(Binomial.binomial(2 * mN - 1, mN + 3));
  }
}

