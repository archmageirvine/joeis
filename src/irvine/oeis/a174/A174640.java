package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.a033.A033306;

/**
 * A174640 A triangular sequence:t(n,m)=A033306(n,m)-A033306(n,0)+1.
 * @author Sean A. Irvine
 */
public class A174640 extends A033306 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM).subtract(t(mN, 0)).add(1);
  }
}

