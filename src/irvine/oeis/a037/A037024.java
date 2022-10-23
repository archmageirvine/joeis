package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A037024 Position of start of first occurrence of prime(n) after the decimal point in expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037024 extends Sequence1 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000796());
  private final Fast mPrime = new Fast();
  private long mP = 1;

  private boolean isMatch(final int pos, final Z[] t) {
    for (int k = 0; k < t.length; ++k) {
      if (!t[k].equals(mPi.a(pos + k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final String s = String.valueOf(mP);
    final Z[] t = new Z[s.length()];
    for (int k = 0; k < t.length; ++k) {
      t[k] = Z.valueOf(s.charAt(k) - '0');
    }
    int pos = 0;
    while (!isMatch(++pos, t)) {
      // do nothing
    }
    return Z.valueOf(pos);
  }
}
