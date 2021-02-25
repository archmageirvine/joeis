package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039758 Triangle of B-analogs of Stirling numbers of first kind.
 * @author Sean A. Irvine
 */
public class A039758 extends A039757 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN - mM);
  }
}

