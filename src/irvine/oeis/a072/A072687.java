package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A072687.
 * @author Sean A. Irvine
 */
public class A072687 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mLimit = 1;
  private long mC = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    if (mLimit > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    while ((mP = mPrime.nextPrime(mP)) < mLimit) {
      final int plen = English.toEnglish((int) mP).replaceAll("[ \\-]", "").length();
      if (mPrime.isPrime(plen)) {
        ++mC;
      }
    }
    mP = mPrime.prevPrime(mP);
    return Z.valueOf(mC);
  }
}
