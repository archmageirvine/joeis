package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000006;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A056893 Smallest prime with square excess of n.
 * @author Sean A. Irvine
 */
public class A056893 extends Sequence1 {

  private final LongDynamicArray<Z> mSmallest = new LongDynamicArray<>();
  private final Sequence mA000006 = new A000006();
  private final Sequence mA000040 = new A000040();
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mSmallest.get(mN) == null) {
      final Z p = mA000040.next();
      final long excess = p.subtract(mA000006.next().square()).longValue();
      if (mSmallest.get(excess) == null) {
        mSmallest.set(excess, p);
      }
    }
    return mSmallest.get(mN);
  }
}
