package irvine.oeis.a385;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A385997 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A385997 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;
  private long mP = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      final int omega = Functions.BIG_OMEGA.i(mSum);
      if (mFirsts.get(omega) == 0) {
        mFirsts.set(omega, mM);
        if (mVerbose) {
          StringUtils.message("a(" + omega + ") = " + mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

