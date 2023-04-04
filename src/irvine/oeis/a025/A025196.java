package irvine.oeis.a025;

import irvine.math.MemoryFunction;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025196 a(n) = floor(Sum_{1&lt;=i&lt;j&lt;=n} (sqrt(j)-sqrt(i))^2).
 * @author Sean A. Irvine
 */
public class A025196 extends MemoryFunction<Long, CR> implements Sequence {

  private long mN = 1;
  private CR mSum = CR.ZERO;

  @Override
  protected CR compute(final Long key) {
    return CR.valueOf(key).sqrt();
  }

  @Override
  public Z next() {
    final CR sk = getValue(++mN);
    for (long j = 1; j < mN; ++j) {
      final CR d = sk.subtract(getValue(j));
      mSum = mSum.add(d.multiply(d));
    }
    return mSum.floor();
  }
}
