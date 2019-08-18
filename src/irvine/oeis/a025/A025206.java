package irvine.oeis.a025;

import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025206.
 * @author Sean A. Irvine
 */
public class A025206 extends MemoryFunction<Long, CR> implements Sequence {

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  @Override
  public Z next() {
    final CR sk = getValue(++mN);
    for (long j = 2; j < mN; ++j) {
      final CR d = sk.subtract(getValue(j));
      mSum = mSum.add(d.multiply(d));
    }
    return mSum.floor();
  }
}
