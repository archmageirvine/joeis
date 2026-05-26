package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392672 Smallest number m such that m*(m+1)*(m+2) has exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A392672 extends Sequence2 {

  private int mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(Z.valueOf(mM).multiply(mM + 1).multiply(mM + 2)) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
