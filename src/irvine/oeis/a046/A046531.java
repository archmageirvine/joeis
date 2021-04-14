package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046531 Numerators of elements to right of central elements of 1/2-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046531 extends A046213 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = (mN + 2) / 2;
    }
    return get(mN, mM).num();
  }
}
