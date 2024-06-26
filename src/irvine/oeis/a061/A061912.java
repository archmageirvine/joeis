package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A061912 a(n) is the smallest m for which sqrt(sum of digits of m^2) = n.
 * @author Sean A. Irvine
 */
public class A061912 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    while (mA.get(mN) == 0) {
      final long t = Functions.DIGIT_SUM.l(Z.valueOf(++mM).square());
      final long s = Functions.SQRT.l(t);
      if (s * s == t && mA.get(s) == 0) {
        mA.set(s, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
