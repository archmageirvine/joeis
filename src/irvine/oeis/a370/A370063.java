package irvine.oeis.a370;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a123.A123551;

/**
 * A370063 Triangle read by rows: T(n,k) is the number of unlabeled loopless multigraphs without endpoints with n edges covering k vertices, 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A370063 extends A123551 {
  private int mN = -1;
  private int mK = 0;
  private Z mPrevious;

  @Override
  protected Polynomial<Z> edgeOrbit(final int size, final int degreeLimit) {
    return RING.series(RING.one(), RING.oneMinusXToTheN(Z.ONE, size), degreeLimit);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
      mPrevious = Z.ZERO;
    }
    final Z count = endpointFree(mK, mN).coeff(mN);
    final Z res = count.subtract(mPrevious);
    mPrevious = count;
    return res;
  }
}
