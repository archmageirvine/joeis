package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073722 Least x such that Mod[Sigma[x],Pi[x]]=n or zero if no such number exists.
 * @author Sean A. Irvine
 */
public class A073722 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mPrimePi = new A000720().skip();
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long res = Functions.SIGMA1.z(++mM).mod(mPrimePi.next().longValueExact());
      if (mFirsts.get(res) == 0) {
        mFirsts.set(res, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
