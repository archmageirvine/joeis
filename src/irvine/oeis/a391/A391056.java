package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391056 Triangle read by rows: T(n,k) = 9*(q+1)*q/2 + (3*q+2)*(n mod 3) - 3*k + 3 for 1 &lt;= k &lt;= n, where q = floor(n/3).
 * @author Sean A. Irvine
 */
public class A391056 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    final long q = mN / 3;
    return Functions.TRIANGULAR.z(q).multiply(9).add((3 * q + 2) * (mN % 3)).subtract(3 * mM);
  }
}

