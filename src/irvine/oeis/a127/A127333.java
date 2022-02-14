package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a082.A082246;

/**
 * A082246 Numbers that are the sum of 6 consecutive primes..
 * @author Georg Fischer
 */
public class A127333 extends A082246 {

  /** Construct the sequence. */
  public A127333() {
    this(6);
  }

  /**
   * Generic constructor with parameters
   * @param pulk number of consecutive primes to be summed
   */
  public A127333(final int pulk) {
    super(pulk);
  }

  @Override
  public Z next() {
    final Z result = mSum;
    mSum = mSum.add(mHead.next()).subtract(mTail.next());
    return result;
  }
}
