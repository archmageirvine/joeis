package irvine.oeis.a025;

import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;

/**
 * A025207 a(n) = [ Sum{(log(j)-log(i))^3} ], 2 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A025207 extends MemoryFunctionSequence<Long, CR> {

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
      mSum = mSum.add(ComputableReals.SINGLETON.pow(d, 3));
    }
    return mSum.floor();
  }
}
