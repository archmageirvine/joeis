package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087182 Number partition numbers &lt;= P(n) of the form 3*k+2 (P = A000041).
 * @author Sean A. Irvine
 */
public class A087182 extends Sequence0 {

  private long mN = -1;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.PARTITIONS.z(++mN).mod(3) == 2) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
