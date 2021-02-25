package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039762 Triangle of D-analogs of Stirling numbers of first kind.
 * @author Sean A. Irvine
 */
public class A039762 extends A039757 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == 0) {
      return get(n - 1, 0).multiply(1 - n);
    }
    if (n == m) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(n - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
