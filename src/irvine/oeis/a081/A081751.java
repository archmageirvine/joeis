package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005101;
import irvine.util.array.LongDynamicArray;

/**
 * A081751 a(n) is the smallest number that is precisely n-tuply abundant.
 * @author Sean A. Irvine
 */
public class A081751 extends Sequence1 {

  private final Sequence mA = new A005101();
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z m = mA.next();
      final long ac = A081699.count(m);
      if (mFirsts.get(ac) == null) {
        mFirsts.set(ac, m);
      }
    }
    return mFirsts.get(mN);
  }
}
