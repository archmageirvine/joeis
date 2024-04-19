package irvine.oeis.a146;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;


/**
 * A146305 Array T(n,m) = 2*(2m+3)!*(4n+2m+1)!/(m!*(m+2)!*n!*(3n+2m+3)!) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A146305 extends Sequence0 {


  /**
   * Return an entry in this sequence.
   * @param n major index
   * @param m minor index
   * @return sequence values
   */
  public Z brownD(final int n, final int m) {
    return Functions.FACTORIAL.z(2 * m + 3).multiply2().multiply(Functions.FACTORIAL.z(4 * n + 2 * m + 1))
      .divide(Functions.FACTORIAL.z(m)).divide(Functions.FACTORIAL.z(m + 2))
      .divide(Functions.FACTORIAL.z(n)).divide(Functions.FACTORIAL.z(3 * n + 2 * m + 3));
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return brownD(mN - mM, mM);
  }
}
