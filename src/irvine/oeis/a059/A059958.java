package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059958 Smallest number m such that m*(m+1) has at least n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A059958 extends Sequence1 {

  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(mM * (mM + 1)) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
