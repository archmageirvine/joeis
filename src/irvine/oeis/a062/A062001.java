package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062001 Table by antidiagonals of n-Stohr sequences: T(n,k) is least positive integer not the sum of at most n distinct terms in the n-th row from T(n,1) through to T(n,k-1).
 * @author Sean A. Irvine
 */
public class A062001 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return 2L * m < n ? Z.ONE.shiftLeft(m).subtract(1).multiply(n - 2L * m + 1).add(1) : Z.ONE.shiftLeft(n - m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
