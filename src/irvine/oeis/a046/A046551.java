package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046551 Numerators of the elements to the right of the central elements of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046551 extends A046534 {

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
