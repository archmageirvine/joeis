package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073429 Upper triangular region of the table A073345.
 * @author Sean A. Irvine
 */
public class A073429 extends A073345 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN);
  }
}

