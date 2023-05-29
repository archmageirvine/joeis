package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A063972 a(n) is the smallest m such that usigma(m) = n (or 0 if no such m).
 * @author Sean A. Irvine
 */
public class A063972 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      final long us = Jaguar.factor(++mM).unitarySigma().longValueExact();
      if (mFirsts.get(us) == 0) {
        mFirsts.set(us, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
