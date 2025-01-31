package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074796 Number of numbers k &lt;= n such that tau(k) == 2 (mod 3) where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A074796 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.SIGMA0.z(++mN).mod(3) == 2) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
