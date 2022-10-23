package irvine.oeis.a099;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099722 From a 2-dimensional walk involving primes.
 * @author Sean A. Irvine
 */
public class A099722 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 7;
  private long mX = -1;
  private long mY = 0;

  @Override
  public Z next() {
    do {
      switch ((int) (mP % 5)) {
      case 1:
        ++mY;
        break;
      case 2:
        ++mX;
        break;
      case 3:
        --mY;
        break;
      default: // i.e. 4
        --mX;
        break;
      }
      mP = mPrime.nextPrime(mP);
    } while (mX != 0 || mY != 0);
    return Z.valueOf(mP);
  }
}

