package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A050767 Let f(m) = smallest composite number that takes m steps of "add prime factors to number" to reach a prime and g(m) be the prime that is reached. Sequence gives values of g(m), sorted and duplicates removed.
 * @author Sean A. Irvine
 */
public class A050767 extends A050703 {

  private final LongDynamicBooleanArray mSteps = new LongDynamicBooleanArray();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        long cnt = 0;
        Z t = mN;
        while (true) {
          ++cnt;
          t = f(t);
          if (t.isProbablePrime()) {
            if (!mSteps.isSet(cnt)) {
              if (t.compareTo(mPrev) > 0) {
                mA.add(t);
              }
              mSteps.set(cnt);
            }
            break;
          }
        }
      }
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
