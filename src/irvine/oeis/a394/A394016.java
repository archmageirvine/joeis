package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394016 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A394016 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 1;
    }
    for (final Z dd : Jaguar.factor(mM).divisors()) {
      final long d = dd.longValue();
      if (Math.max(d, mM / d) <= mN) {
        return Z.ONE;
      }
    }
    return Z.ZERO;
  }
}
