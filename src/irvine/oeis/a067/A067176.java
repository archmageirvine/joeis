package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067176 A triangle of generalized Stirling numbers: sum of consecutive terms in the harmonic sequence multiplied by the product of their denominators.
 * @author Sean A. Irvine
 */
public class A067176 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(1, mN - mM, k -> Z.valueOf(mM).pow(k - 1).multiply(k).multiply(Functions.STIRLING1.z(mN - mM, k).abs()));
  }
}
