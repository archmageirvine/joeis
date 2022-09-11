package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059033 Triangle in A059032 read by rows from left to right.
 * @author Sean A. Irvine
 */
public class A059033 extends A059032 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
