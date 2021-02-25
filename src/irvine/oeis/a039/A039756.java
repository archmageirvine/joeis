package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039756 Triangle of B-analogs of Stirling numbers of 2nd kind.
 * @author Sean A. Irvine
 */
public class A039756 extends A039755 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN - mM);
  }
}

