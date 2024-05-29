package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069926 Number of k, 1&lt;=k&lt;=n, such that k divides sigma(k).
 * @author Sean A. Irvine
 */
public class A069926 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (Functions.SIGMA.z(++mN).mod(mN) == 0) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
