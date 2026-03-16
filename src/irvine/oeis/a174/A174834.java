package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174834 Triangle read by rows: T(n,k) = (Stirling1(n,k) + Stirling1(n,n-k)) * binomial(n,k) with T(0,0)=1.
 * @author Sean A. Irvine
 */
public class A174834 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      if (++mN == 0) {
        return Z.ONE;
      }
    }
    return Functions.STIRLING1.z(mN, mM).add(Functions.STIRLING1.z(mN, mN - mM)).multiply(Binomial.binomial(mN, mM));
  }
}

