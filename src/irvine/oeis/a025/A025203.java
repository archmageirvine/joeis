package irvine.oeis.a025;

import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025203.
 * @author Sean A. Irvine
 */
public class A025203 extends MemoryFunction<Long, CR> implements Sequence {

  protected long mN = 3;
  protected CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  @Override
  public Z next() {
    final CR sk = getValue(++mN);
    for (long j = 2; j < mN; ++j) {
      final CR sj = sk.multiply(getValue(j));
      for (long i = 1; i < j; ++i) {
        mSum = mSum.add(sj.multiply(getValue(i)));
      }
    }
    return mSum.floor();
  }
}
