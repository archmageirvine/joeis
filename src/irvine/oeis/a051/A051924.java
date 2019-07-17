package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051924 <code>a(n) = binomial(2*n,n) - binomial(2*n-2,n-1)</code>; or <code>(3n-2)*C(n-1)</code>, where C = Catalan numbers <code>(A000108)</code>.
 * @author Sean A. Irvine
 */
public class A051924 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).subtract(Binomial.binomial(2 * mN - 2, mN - 1));
  }
}
