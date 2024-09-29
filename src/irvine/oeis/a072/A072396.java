package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072396 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (mA.get(++k) == 0) {
        mA.set(k, Functions.BIG_OMEGA.l(Functions.FIBONACCI.z(k)));
      }
      if (mA.get(k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
