package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395090 a(n) is the minimum number of moves needed to reach 0 from n, where a move subtracts a prime divisor of the current number.
 * @author Sean A. Irvine
 */
public class A395090 extends Sequence2 {

  private long mN = 1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  @Override
  public Z next() {
    long min = Long.MAX_VALUE;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      min = Math.min(min, mA.get(mN - p.longValue()));
    }
    mA.set(mN, ++min);
    return Z.valueOf(min);
  }
}
