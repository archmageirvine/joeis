package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073509 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final int mDigit;
  private Z mM = Z.ONE;
  private Z mCount = Z.ZERO;

  protected A073509(final int digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A073509() {
    this(9);
  }

  @Override
  public Z next() {
    final Z s = mM.multiply(mDigit).subtract(1);
    final Z e = mM.multiply(mDigit + 1);
    mM = mM.multiply(10);
    long cnt = 0;
    for (Z p = mPrime.nextPrime(s); p.compareTo(e) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    mCount = mCount.add(cnt);
    return mCount;
  }
}

