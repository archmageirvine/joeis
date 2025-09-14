package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035485;
import irvine.util.array.LongDynamicIntArray;

/**
 * A080347 Number of shuffles in Guy's shuffle (A035485) corresponding to the terms in A080346.
 * @author Sean A. Irvine
 */
public class A080347 extends Sequence1 {

  private final Sequence mS = new A035485().skip();
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      final long card = mS.next().longValueExact();
      if (mCounts.increment(card) == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
