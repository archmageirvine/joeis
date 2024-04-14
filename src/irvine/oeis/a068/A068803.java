package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068803 Smaller of two consecutive primes which have no common digits.
 * @author Sean A. Irvine
 */
public class A068803 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.TWO);
    mA.add(Z.THREE);
    mA.add(Z.FIVE);
    mA.add(Z.SEVEN);
  }
  private Z mT = Z.ONE;

  private boolean check(final Z u) {
    final Z v = mPrime.nextPrime(u);
    return (Functions.SYNDROME.i(u) & Functions.SYNDROME.i(v)) == 0;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mT = mT.multiply(10);
      for (long a = Z.TEN.equals(mT) ? 2 : 1; a <= 8; ++a) {
        final Z up = mPrime.prevPrime(mT.multiply(a));
        if (check(up)) {
          mA.add(up);
        }
      }
    }
    return mA.pollFirst();
  }
}
