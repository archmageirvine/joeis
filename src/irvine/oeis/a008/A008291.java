package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008291.
 * @author Sean A. Irvine
 */
public class A008291 extends A008290 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
