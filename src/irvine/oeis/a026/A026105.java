package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026105 Triangle T read by rows: differences of Motzkin triangle <code>(A026300)</code>.
 * @author Sean A. Irvine
 */
public class A026105 extends A026300 {

  private long mN = -1;
  private long mM = 0;

  protected Z m(final long n, final long m) {
    return t(n, m).subtract(t(n - 1, m - 1)).max(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return m(mN, mM);
  }
}
