package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064891 "Binary potency" of n: length of shortest blocks of 0's inserted between the bits of n required to "dilute" it into a nonprime.
 * @author Sean A. Irvine
 */
public class A064891 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  static int computePotency(final long n) {
    final String binary = Long.toBinaryString(n);
    final StringBuilder insert = new StringBuilder("0");
    int cnt = 1;
    while (true) {
      final StringBuilder s = new StringBuilder();
      for (int k = 0; k < binary.length(); ++k) {
        s.append(insert);
        s.append(binary.charAt(k));
      }
      if (!new Z(s, 2).isProbablePrime()) {
        return cnt;
      }
      insert.append('0');
      ++cnt;
    }
  }

  @Override
  public Z next() {
    if (!mPrime.isPrime(++mN)) {
      return Z.ZERO;
    }
    return Z.valueOf(computePotency(mN));
  }
}

