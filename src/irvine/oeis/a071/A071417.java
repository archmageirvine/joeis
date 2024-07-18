package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071386.
 * @author Sean A. Irvine
 */
public class A071417 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Rationals.SINGLETON.sum(mM + 1, mN, j -> new Q(1, j)).multiply(mN).ceiling();
  }
}
