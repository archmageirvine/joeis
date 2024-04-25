package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069323 Triangle in which n-th row gives ascending sequence of numbers derived from the (3x+1) problem, beginning with n. Numbers in one row share the same number of iteration steps required to reach the value of '1' when applying the (3x+1) algorithm. Each row terminates with a power of 2.
 * @author Sean A. Irvine
 */
public class A069323 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    if (mM.bitCount() == 1) {
      mM = Z.valueOf(++mN);
    } else {
      mM = mM.multiply(6).add(Z.ONE.shiftLeft(mM.makeOdd().auxiliary() + 1));
    }
    return mM;
  }
}
