package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025202 a(n) = [ 2nd elementary symmetric function of {log(k)} ], k = 2,3,...,n.
 * @author Sean A. Irvine
 */
public class A025202 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025202() {
    super(3);
  }

  protected long mN = 2;
  protected CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  @Override
  public Z next() {
    final Long key = ++mN;
    final CR sk = get(key);
    for (long j = 1; j < mN; ++j) {
      mSum = mSum.add(sk.multiply(get(j)));
    }
    return mSum.floor();
  }
}
