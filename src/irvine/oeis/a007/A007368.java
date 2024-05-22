package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicIntArray;

/**
 * A007368 Smallest k such that sigma(x) = k has exactly n solutions.
 * @author Sean A. Irvine
 */
public class A007368 extends Sequence0 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = -1;
  private long mS = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      while (k >= mS || k >= mA.length()) {
        mA.increment(Functions.SIGMA1.l(++mS));
      }
      if (mA.get(k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
