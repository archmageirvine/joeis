package irvine.oeis.a019;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019549.
 * @author Sean A. Irvine
 */
public class A019549 implements Sequence {

  private final TreeSet<String> mConcatOfPrimes = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      final long oldP = mP;
      if (++mN == mP) {
        mConcatOfPrimes.add(String.valueOf(mN));
        mP = mPrime.nextPrime(mP);
      }
      final String v = String.valueOf(mN);
      for (int split = 1; split < v.length(); ++split) {
        if (mConcatOfPrimes.contains(v.substring(0, split)) && mConcatOfPrimes.contains(v.substring(split))) {
          mConcatOfPrimes.add(String.valueOf(mN));
          if (mN == oldP) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
