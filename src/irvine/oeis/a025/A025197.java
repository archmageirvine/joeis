package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A025197 a(n) = floor( Sum_{1 &lt;= i &lt; j &lt;= n} ((sqrt(j)-sqrt(i))^3) ).
 * @author Sean A. Irvine
 */
public class A025197 extends MemoryFunctionSequence<Long, CR> {

  /** Construct the sequence. */
  public A025197() {
    super(2);
  }

  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).sqrt();
  }

  @Override
  public Z next() {
    final Long key = ++mN;
    final CR sk = get(key);
    for (long j = 1; j < mN; ++j) {
      final CR d = sk.subtract(get(j));
      mSum = mSum.add(ComputableReals.SINGLETON.pow(d, 3));
    }
    return mSum.floor();
  }
}
