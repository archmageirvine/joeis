package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A030086 Primes p whose digits do not appear in p^2.
 * @author Sean A. Irvine
 */
public class A030086 extends AbstractSequence {

  static boolean isOk(final Z a, final Z b) {
    final int[] synA = ZUtils.digitCounts(a);
    final int[] synB = ZUtils.digitCounts(b);
    for (int k = 0; k < synA.length; ++k) {
      if (synA[k] > 0 && synB[k] != 0) {
        return false;
      }
    }
    return true;
  }

  private int mPower;
  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A030086() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param power
   */
  public A030086(final int offset, final int power) {
    super(offset);
    mPower = power;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isOk(mP, mP.pow(mPower))) {
        return mP;
      }
    }
  }
}
