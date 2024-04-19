package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A133524 Sum of squares of four consecutive primes.
 * Similar to A082246.
 * @author Georg Fischer
 */
public class A133524 extends Sequence1 {

  private final int mExpon;
  private Z mSum;
  private final Sequence mHead;
  private final Sequence mTail;

  /** Construct the sequence. */
  public A133524() {
    this(4, 2);
  }

  /**
   * Generic constructor with parameters
   * @param pulk number of consecutive primes to be summed
   * @param expon exponent for the prime
   */
  public A133524(final int pulk, final int expon) {
    mExpon = expon;
    mHead = new A000040();
    mTail = new A000040();
    mSum = Z.ZERO;
    for (int i = 1; i <= pulk; ++i) {
      mSum = mSum.add(mHead.next().pow(mExpon));
    }
  }

  @Override
  public Z next() {
    final Z result = mSum;
    mSum = mSum.add(mHead.next().pow(mExpon)).subtract(mTail.next().pow(mExpon));
    return result;
  }
}
