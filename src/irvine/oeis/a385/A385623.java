package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385623 Array read by ascending antidiagonals: A(n,k) is the number obtained by concatenation of n with k in that order, with k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A385623 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return new Z(String.valueOf(mN - mM) + mM);
  }
}
