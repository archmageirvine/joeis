package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174861 Triangle read by rows: T(n,k) = n! * (Stirling1(n,k) + Stirling1(n,n-k) - 1) + 1 with T(0,0)=1.
 * @author Sean A. Irvine
 */
public class A174861 extends Sequence0 {

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
    return Functions.STIRLING1.z(mN, mM).add(Functions.STIRLING1.z(mN, mN - mM).subtract(1)).multiply(Functions.FACTORIAL.z(mN)).add(1);
  }
}

