package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073436 Smallest k such that k mod pi(k) = n.
 * @author Sean A. Irvine
 */
public class A073436 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 1;
  private final Sequence mPi = new A000720().skip();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long r = ++mM % mPi.next().longValueExact();
      if (mFirsts.get(r) == 0) {
        mFirsts.set(r, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
