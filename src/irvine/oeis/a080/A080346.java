package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035485;
import irvine.util.array.LongDynamicIntArray;

/**
 * A080346 First card number to reach the top of the deck n times in Guy's shuffle (see A035485).
 * @author Sean A. Irvine
 */
public class A080346 extends Sequence1 {

  private final Sequence mS = new A035485().skip();
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final long card = mS.next().longValueExact();
      if (mCounts.increment(card) == mN) {
        return Z.valueOf(card);
      }
    }
  }
}
