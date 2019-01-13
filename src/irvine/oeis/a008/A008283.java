package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008283.
 * @author Sean A. Irvine
 */
public class A008283 extends A008281 {

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

