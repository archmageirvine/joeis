package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073430 Upper triangular region of the table A073346.
 * @author Sean A. Irvine
 */
public class A073430 extends A073346 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

