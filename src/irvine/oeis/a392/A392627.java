package irvine.oeis.a392;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392627 Tetrahedron read by slices read by antidiagonals: T(n,i,j) is the number of paths from (0,0,0) to (n,i,j) consisting of moves {(1,0,0), (1,1,0), (1,0,1), (1,1,1)} that remain confined to i+j&lt;=n at each step.
 * @author Sean A. Irvine
 */
public class A392627 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;
  private long mK = -1;

  private Z t(final long n, final long i, final long j) {
    return Binomial.binomial(n, i).multiply(Binomial.binomial(n, j)).subtract(Binomial.binomial(n, i - 1).multiply(Binomial.binomial(n, j - 1)));
  }

  @Override
  public Z next() {
    if (++mK > mM) {
      if (++mM > mN) {
        ++mN;
        mM = 0;
      }
      mK = 0;
    }
    return t(mN, mM - mK, mK);
  }
}
