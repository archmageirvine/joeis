package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A393324 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A393324 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final int omega = Functions.OMEGA.i(q.square().subtract(p.square()));
      if (mFirsts.get(omega) == null) {
        mFirsts.set(omega, p);
        if (mVerbose) {
          StringUtils.message("Solution for " + omega + " is " + p);
        }
      }
    }
    return mFirsts.get(mN);
  }
}

