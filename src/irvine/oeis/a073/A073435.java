package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073435 Smallest x such that remainder if x-th composite is divided by pi(x) equals n.
 * @author Sean A. Irvine
 */
public class A073435 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;
  private final Sequence mC = new A002808().skip();
  private final Sequence mPi = new A000720().skip();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long r = mC.next().mod(mPi.next()).longValueExact();
      if (mFirsts.get(r) == 0) {
        mFirsts.set(r, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
