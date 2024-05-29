package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069924 Number of k, 1&lt;=k&lt;=n, such that phi(k) divides k.
 * @author Sean A. Irvine
 */
public class A069924 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (++mN % Functions.PHI.l(mN) == 0) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
