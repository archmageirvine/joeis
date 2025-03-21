package irvine.oeis.a076;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A076106 Out of all the n-digit primes, which one takes the longest time to appear in the digits of Pi (ignoring the initial 3)? The answer is a(n), and it appears at position A076130(n).
 * @author Sean A. Irvine
 */
public class A076106 extends Sequence1 {

  private final StringBuilder mPiDigits = new StringBuilder();
  private final Sequence mPi = new A000796().skip();
  private final Fast mPrime = new Fast();
  private long mM = 1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Construct all n-digit primes
    final Set<String> primes = new HashSet<>();
    long p = mM;
    mM *= 10;
    while ((p = mPrime.nextPrime(p)) < mM) {
      primes.add(String.valueOf(p));
    }
    // Special case for n == 1 (makes n>1 checking faster)
    if (mN == 1) {
      mPiDigits.append(mPi.next());
      return Z.SEVEN;
    }
    // Search for them
    int pos = 0;
    while (primes.size() > 1) {
      if (pos + mN >= mPiDigits.length()) {
        mPiDigits.append(mPi.next());
      }
      final char c = mPiDigits.charAt(pos + mN - 1);
      if ((c & 1) != 0 && c != '5') {
        primes.remove(mPiDigits.substring(pos, pos + mN));
      }
      ++pos;
    }
    return new Z(primes.iterator().next());
  }
}
