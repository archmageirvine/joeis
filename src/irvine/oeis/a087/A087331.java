
package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010785;
import irvine.util.array.DynamicArray;

/**
 * A087331 Smallest number with all identical digits having n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A087331 extends Sequence0 {

  private final Sequence mS = new A010785().skip();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z s = mS.next();
      final int omega = Functions.OMEGA.i(s);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, s);
      }
    }
    return mFirsts.get(mN);
  }
}
