package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025206 [ Sum{(log(j)-log(i))^2} ], 2 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A025206 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025206() {
    super(3);
  }

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).log();
  }

  @Override
  public Z next() {
    final Long key = ++mN;
    final CR sk = get(key);
    for (long j = 2; j < mN; ++j) {
      final CR d = sk.subtract(get(j));
      mSum = mSum.add(d.multiply(d));
    }
    return mSum.floor();
  }
}
