package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046539 Numerators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046539 extends A046534 {

  private long mN = -1;
  private long mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(get(mN, mM));
  }
}
