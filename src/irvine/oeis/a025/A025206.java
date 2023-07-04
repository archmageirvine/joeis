package irvine.oeis.a025;

import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A025206 [ Sum{(log(j)-log(i))^2} ], 2 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A025206 extends MemoryFunctionSequence<Long, CR> {

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
