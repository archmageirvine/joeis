package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A003056 n appears n+1 times. Also the array A(n,k) = n+k (n &gt;= 0, k &gt;= 0) read by antidiagonals. Also inverse of triangular numbers.
 * Formula: floor((sqrt(1+8*n)-1)/2).
 * @author Sean A. Irvine
 */
public class A003056 extends Sequence0 implements DirectSequence {

  private long mN = -1;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC > mN) {
      ++mN;
      mC = 0;
    }
    return Z.valueOf(mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SQRT.z(n.multiply(8).add(1)).subtract(1).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
