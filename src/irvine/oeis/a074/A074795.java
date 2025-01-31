package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074795 Number of numbers k &lt;= n such that tau(k) == 0 (mod 3) where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A074795 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.SIGMA0.z(++mN).mod(3) == 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
