package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025195 [ 4th elementary symmetric function of {sqrt(k)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025195 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025195() {
    super(4);
  }

  private long mN = 3;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).sqrt();
  }

  @Override
  public Z next() {
    final Long key = ++mN;
    final CR sl = get(key);
    for (long k = 3; k < mN; ++k) {
      final CR sk = sl.multiply(get(k));
      for (long j = 2; j < k; ++j) {
        final CR sj = sk.multiply(get(j));
        for (long i = 1; i < j; ++i) {
          mSum = mSum.add(sj.multiply(get(i)));
        }
      }
    }
    return mSum.floor();
  }
}
