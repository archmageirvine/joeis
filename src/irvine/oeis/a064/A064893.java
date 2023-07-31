package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A064893 Smallest number with "binary potency" of n. Blocks of at least n 0's must be inserted between the bits of a(n) to "dilute" it into a nonprime.
 * @author Sean A. Irvine
 */
public class A064893 extends Sequence0 {

  private static final int PROGRESS_REPORTING = 1000000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mA = new DynamicLongArray();
  {
    mA.set(0, 1L);
  }
  private int mN = -1;
  private long mP = 1;
  private final Fast mPrime = new Fast();
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final int potency = A064891.computePotency(mP);
      if (mA.get(potency) == 0) {
        mA.set(potency, mP);
        if (mVerbose && potency > mN) {
          StringUtils.message("Found " + mP + " has potency " + potency);
        }
      }
      if (mVerbose && ++mM >= PROGRESS_REPORTING) {
        StringUtils.message("Search completed to " + mP);
        mM = 0;
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

