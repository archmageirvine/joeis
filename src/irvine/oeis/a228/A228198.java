package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.a082.A082246;

/**
 * A228198 Smallest of five consecutive primes whose sum is not a prime.
 * @author Georg Fischer
 */
public class A228198 extends A082246 {

  /** Construct the sequence. */
  public A228198() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param pulk number of consecutive primes to be summed
   */
  public A228198(final int pulk) {
    super(pulk);
  }

  @Override
  public Z next() {
    while (mSum.isProbablePrime()) {
      mSum = mSum.add(mHead.next()).subtract(mTail.next());
    }
    final Z result = mTail.next();
    mSum = mSum.add(mHead.next()).subtract(result);
    return result;
  }
}
