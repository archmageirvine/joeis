package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002113;
import irvine.util.array.LongDynamicArray;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076886 extends Sequence0 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private final Sequence mPalindromes = new A002113().skip();
  private long mN = -1;


  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z p = mPalindromes.next();
      final long omega = Functions.BIG_OMEGA.l(p);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, p);
      }
    }
    return mFirsts.get(mN);
  }
}
