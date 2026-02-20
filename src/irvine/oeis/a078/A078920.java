package irvine.oeis.a078;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078920 Upper triangle of Catalan Number Wall.
 * @author Sean A. Irvine
 */
public class A078920 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Rationals.SINGLETON.product(1, mN - mM, i -> Rationals.SINGLETON.product(i, mN - mM, j -> new Q(i + j + 2L * mM, i + j))).toZ();
  }
}
