package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395185 A triangle read by rows: T(n,k) = T(n-1,k-1) * T(n-1,k) for n &gt;= 3, 1 &lt;= k &lt;= n-1, with T(n,0) = T(n,n) = 1 and T(2,1) = 2.
 * @author Sean A. Irvine
 */
public class A395185 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN < 2) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(Functions.BINOMIAL.l(mN - 2, mM - 1));
  }
}

