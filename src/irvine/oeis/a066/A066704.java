package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066704 Triangle with a(n,k) = C(n,floor(n/k)) with n&gt;=k&gt;=1.
 * @author Sean A. Irvine
 */
public class A066704 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mN / mM);
  }
}
