package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060971 Number of numbers of form p^5, p prime, &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A060971 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mLimit = Z.ONE;
  private Z mP = Z.ZERO;
  private long mCount = 0;
  private final long mPower;

  protected A060971(final int power) {
    mPower = power;
  }

  /** Construct the sequence. */
  public A060971() {
    this(5);
  }

  @Override
  public Z next() {
    while (mP.pow(mPower).compareTo(mLimit) <= 0) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    mLimit = mLimit.multiply2();
    return Z.valueOf(mCount - 1);
  }
}
