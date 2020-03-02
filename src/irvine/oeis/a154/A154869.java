package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A154869 A triangular sequence: <code>t0(n,m) = Sum[(-1)^j*Binomial[n + 2, j]*(m - j + 1)^(n + 1), {j, 0, m + 1}]; t1(n,m)=-Sum[(-1)^j*t0[n + 2, j]*(m - j + 1)^(n + 1), {j, 0, m + 1}]; t(n,m)=t1(n,m)+t1(n,n-m)</code>.
 * @author Sean A. Irvine
 */
public class A154869 extends A008292 {

  private int mN = -1;
  private int mM = 0;

  private Z t0(final long n, final long m) {
    if (m > n) {
      System.out.println("Huh? Out of range request?");
    }
    return get(n + 1, m + 1);
  }

  // t[n_, m_] = -Sum[(-1)^j*t0[n + 2, j]*(m - j + 1)^(n + 1), {j, 0, m + 1}];
  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (long j = 0; j <= m + 1; ++j) {
      final Z t0 = t0(n + 2L, j);
//      System.out.println("n=" + n + " m=" + m + " j=" + j + " t0=" + t0);
      sum = sum.signedAdd((j & 1) == 0, t0.multiply(Z.valueOf(m - j + 1).pow(n + 1)));
    }
    return sum.negate();
  }

  @Override
  public Z next() {
    System.out.println("t0(2,1)=" + t0(2L,1L));
    if (++mM > mN) {
      ++mN;
      mM = 0;
      System.out.println("n=" + mN);
    }
    System.out.println("t(" + mN + "," + mM + ")=" + t(mN,mM));
    return t(mN, mM);

    //return t(mN, mM).add(t(mN, mN - mM).divide2());
  }
}
