package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A079802.
 * @author Sean A. Irvine
 */
public class A079802 implements Sequence {

  private long mP = 1;
  private Z mPrev = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    do {
      mP = mPrime.nextPrime(mP);
      sum = sum.add(mP);
    } while (sum.compareTo(mPrev) < 0 || !Z.ZERO.equals(sum.mod(mPrev)));
    mPrev = sum;
    return sum;
  }
}

