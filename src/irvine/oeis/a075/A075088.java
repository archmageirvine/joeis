package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000217;
import irvine.util.array.DynamicArray;

/**
 * A075078.
 * @author Sean A. Irvine
 */
public class A075088 extends Sequence0 {

  private final Sequence mTriangular = new A000217().skip();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = mTriangular.next();
      final int omega = Functions.BIG_OMEGA.i(t);
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, t);
      }
    }
    return mFirsts.get(mN);
  }
}

