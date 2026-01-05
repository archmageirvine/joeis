package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083003 Triangle read by rows in which each term represents the total area of all the squares found in the grid described in sequence A082652.
 * @author Sean A. Irvine
 */
public class A083003 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(-3 * mM).add(5 * mN - 10).multiply(mM).add(20 * mN - 5).multiply(mM).add(25 * mN + 10).multiply(mM).add(10 * mN + 8).multiply(mM).divide(60);
  }
}
