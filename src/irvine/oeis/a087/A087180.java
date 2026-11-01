package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087180 Number partition numbers &lt;= P(n) of the form 3*k (P = A000041).
 * @author Sean A. Irvine
 */
public class A087180 extends Sequence0 {

  private long mN = -1;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.PARTITIONS.z(++mN).mod(3) == 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
