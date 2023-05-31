package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A063973 a(n) is the largest m such that usigma(m) = n (or 0 if no such m).
 * @author Sean A. Irvine
 */
public class A063973 extends Sequence1 {

  private final LongDynamicLongArray mLasts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      mLasts.set(Jaguar.factor(++mM).unitarySigma().longValueExact(), mM);
    }
    return Z.valueOf(mLasts.get(mN));
  }
}
