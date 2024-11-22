package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073275 Smallest n such that remainder Mod[c(x),x]=n, where c(x) = A002808(x) = x-th composite number or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A073275 extends Sequence1 {

  private final Sequence mC = new A002808();
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN >= 3 && mN <= 6) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long g = mC.next().mod(++mM);
      if (mFirsts.get(g) == 0) {
        mFirsts.set(g, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

