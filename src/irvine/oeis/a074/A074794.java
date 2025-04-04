package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074794 Number of numbers k &lt;= n such that tau(k) == 1 (mod 3) where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A074794 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.SIGMA0.z(++mN).mod(3) == 1) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
