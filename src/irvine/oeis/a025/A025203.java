package irvine.oeis.a025;

import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A025203 a(n) = [ 3rd elementary symmetric function of {log(k)} ], k = 2,3,...,n.
 * @author Sean A. Irvine
 */
public class A025203 extends MemoryFunctionSequence<Long, CR> {

  protected long mN = 3;
  protected CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  @Override
  public Z next() {
    final Long key = ++mN;
    final CR sk = get(key);
    for (long j = 2; j < mN; ++j) {
      final CR sj = sk.multiply(get(j));
      for (long i = 1; i < j; ++i) {
        mSum = mSum.add(sj.multiply(get(i)));
      }
    }
    return mSum.floor();
  }
}
