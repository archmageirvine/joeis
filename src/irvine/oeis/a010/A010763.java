package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010763 <code>a(n) = binomial(2n+1, n+1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A010763 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN + 1).subtract(1);
  }
}
