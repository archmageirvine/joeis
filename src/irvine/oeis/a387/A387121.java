package irvine.oeis.a387;

import irvine.math.z.Z;

/**
 * A387121 allocated for Janaka Rodrigo.
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

