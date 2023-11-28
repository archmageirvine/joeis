package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A060990 Number of solutions to x - d(x) = n, where d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A060990 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mX = 1;

  @Override
  public Z next() {
    ++mN;
    while (mX <= 2 * mN + 3) {
      final long d = mX - Jaguar.factor(mX).sigma0AsLong();
      if (d < mN) {
        throw new RuntimeException("An earlier count was wrong");
      }
      mA.increment(d);
      ++mX;
    }
    return Z.valueOf(mA.get(mN));
  }
}
