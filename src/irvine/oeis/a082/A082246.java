package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A082246 Primes that are the sum of 7 consecutive primes.
 * @author Georg Fischer
 */
public class A082246 implements Sequence {

  protected Z mSum;
  protected Sequence mHead;
  protected Sequence mTail;

  /** Construct the sequence. */
  public A082246() {
    this(7);
  }

  /**
   * Generic constructor with parameters
   * @param pulk number of consecutive primes to be summed
   */
  public A082246(final int pulk) {
    mHead = new A000040();
    mTail = new A000040();
    mSum = Z.ZERO;
    for (int i = 1; i <= pulk; ++i) {
      mSum = mSum.add(mHead.next());
    }
  }

  @Override
  public Z next() {
    while (!mSum.isProbablePrime()) {
      mSum = mSum.add(mHead.next()).subtract(mTail.next());
    }
    final Z result = mSum;
    mSum = mSum.add(mHead.next()).subtract(mTail.next());
    return result;
  }
}
