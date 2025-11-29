package irvine.oeis.a386;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A386886 Triangle read by rows: T(n,k) is the maximum number of strong k-tournaments in any n-tournament.
 * @author Sean A. Irvine
 */
public class A386886 extends Sequence3 {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 3;
    }
    return Binomial.binomial(mN, mM).subtract((mN & 1) == 0
      ? Binomial.binomial(mN / 2, mM - 1).add(Binomial.binomial((mN - 2) / 2, mM - 1)).multiply(mN).divide2()
      : Binomial.binomial((mN - 1) / 2, mM - 1).multiply(mN));
  }
}
