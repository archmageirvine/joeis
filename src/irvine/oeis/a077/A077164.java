package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077164 Triangle in which n-th row gives n numbers relatively prime to n and greater than all earlier terms in the triangle.
 * @author Sean A. Irvine
 */
public class A077164 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 2;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    while (true) {
      if (Functions.GCD.l(mN, ++mK) == 1) {
        return Z.valueOf(mK);
      }
    }
  }
}

