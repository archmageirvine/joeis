package irvine.oeis.a387;

import irvine.math.z.Z;

/**
 * A387121 Array read by antidiagonals: T(n,k) is the number of sets of k integer sided cuboids with distinct volumes that fill an n X n X n cube.
 * @author Sean A. Irvine
 */
public class A387121 extends A387040 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}

