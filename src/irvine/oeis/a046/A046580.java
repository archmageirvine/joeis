package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046580 Numerators of the elements to the right of the central elements of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046580 extends A046563 {

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
