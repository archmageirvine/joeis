package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046899 Triangle in which n-th row is {binomial(n+k,k), k=0..n}, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A046899 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + mM, mM);
  }
}
