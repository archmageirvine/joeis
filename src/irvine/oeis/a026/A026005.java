package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026005 <code>a(n) = T(4*n,n)</code>, where T = Catalan triangle <code>(A008315)</code>.
 * @author Sean A. Irvine
 */
public class A026005 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN + 1, mN).multiply(2 * mN + 2).divide(3 * mN + 2);
  }
}
