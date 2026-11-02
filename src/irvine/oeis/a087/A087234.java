package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005100;
import irvine.util.array.DynamicArray;

/**
 * A087234 Smallest deficient number with n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A087234 extends Sequence1 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private final Sequence mS = new A005100();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z d = mS.next();
      final int o = Functions.OMEGA.i(d);
      if (mA.get(o) == null) {
        mA.set(o, d);
      }
    }
    return mA.get(mN);
  }
}
