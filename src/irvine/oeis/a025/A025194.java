package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025194 a(n) = [ 3rd elementary symmetric function of {sqrt(k)} ], k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025194 extends MemoryFunctionSequence<Long, CR> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025194(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025194() {
    super(3);
  }

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).sqrt();
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
