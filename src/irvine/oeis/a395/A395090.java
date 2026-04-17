package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395090 allocated for Connor O'Higgins.
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
