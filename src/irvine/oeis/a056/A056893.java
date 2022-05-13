package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000006;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A056892 a(n) = square excess of the n-th prime.
 * @author Sean A. Irvine
 */
public class A056893 implements Sequence {

  private final LongDynamicArray<Z> mSmallest = new LongDynamicArray<>();
  private final Sequence mA000006 = new A000006();
  private final Sequence mA000040 = new A000040();
  private int mN = 0;

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
