package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039763 Triangle of D-analogs of Stirling numbers of first kind.
 * @author Sean A. Irvine
 */
public class A039763 extends A039762 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mN - mM);
  }
}

