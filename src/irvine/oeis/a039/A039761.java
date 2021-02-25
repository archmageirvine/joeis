package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039761 Triangle of D-analogs of Stirling numbers of 2nd kind.
 * @author Sean A. Irvine
 */
public class A039761 extends A039760 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = mN;
    }
    return t(mN, mM);
  }
}

