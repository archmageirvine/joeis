package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080524 Triangle read by rows in which the n-th row contains n distinct numbers whose sum is n^n. The numbers are terms of an arithmetic progression with a common difference 1 or 2 respectively accordingly as n is odd or even.
 * @author Sean A. Irvine
 */
public class A080524 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).pow(mN - 1).add((2 * mM - mN - 1) / ((mN & 1) + 1));
  }
}

