package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003409 <code>a(n) = 3*binomial(2n-1,n)</code>.
 * @author Sean A. Irvine
 */
public class A003409 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 1, mN).multiply(3);
  }
}
