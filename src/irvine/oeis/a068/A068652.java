package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A068652.
 * @author Sean A. Irvine
 */
public class A068652 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      String s = mP.toString();
      boolean ok = true;
      for (int k = 1; k < s.length(); ++k) {
        s = s.substring(1) + s.substring(0, 1);
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

