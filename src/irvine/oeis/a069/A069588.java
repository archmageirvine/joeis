package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A069588 Smallest prime in which the n-th significant digit is a 1.
 * @author Georg Fischer
 */
public class A069588 extends AbstractSequence {

  private int mN;
  private final int mDigit;
  private Z mPow10;

  /** Construct the sequence. */
  public A069588() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit the digit
   */
  public A069588(final int offset, final int digit) {
    super(offset);
    mN = 0;
    mDigit = digit;
    mPow10 = Z.valueOf(mDigit);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      switch (mDigit) {
        case 1:
          mPow10 = mPow10.multiply(10);
          return Z.valueOf(11);
        case 2:
          mPow10 = mPow10.multiply(10);
          return Z.TWO;
        case 4:
        case 6:
        case 8:
          mPow10 = mPow10.multiply(10);
          break;
        case 9:
          mPow10 = mPow10.multiply(10);
          return Z.valueOf(19);
        case 0:
          mPow10 = Z.valueOf(1000);
          return Z.valueOf(101);
        case 3:
        case 5:
        case 7:
        default:
          mPow10 = mPow10.multiply(10);
          return Z.valueOf(mDigit);
      }
    }
    Z prime = mPow10.add(1);
    while (!prime.isProbablePrime()) {
      prime = prime.add(Z.TWO);
    }
    mPow10 = mPow10.multiply(10);
    return prime;
  }
}
