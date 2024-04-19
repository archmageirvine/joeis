package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A068652 Numbers such that every cyclic permutation is a prime.
 * @author Sean A. Irvine
 */
public class A068652 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      String s = mP.toString();
      boolean ok = true;
      for (int k = 1; k < s.length(); ++k) {
        s = s.substring(1) + s.charAt(0);
        if (!mPrime.isPrime(new Z(s))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mP;
      }
    }
  }
}

