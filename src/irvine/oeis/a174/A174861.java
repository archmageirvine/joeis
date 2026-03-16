package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174861 A symmetrical triangular sequence:t(n,m)=n!*(StirlingS1[n, m] + StirlingS1[n, n - m] - (StirlingS1[n, 0] + StirlingS1[n, n]) + 1) - n! + 1.
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

