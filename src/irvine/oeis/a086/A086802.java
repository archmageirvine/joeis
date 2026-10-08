package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086802 Triangle read by rows in which row n lists (prime(n)-prime(k))/2 for 2 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A086802 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.PRIME.z(mN + 2).subtract(Functions.PRIME.z(mM + 2)).divide2();
  }
}

