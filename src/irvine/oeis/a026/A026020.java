package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026020 <code>a(n) = C(4n, n) - C(4n, n - 3)</code>.
 * @author Sean A. Irvine
 */
public class A026020 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN).subtract(Binomial.binomial(4 * mN, mN - 3));
  }
}

