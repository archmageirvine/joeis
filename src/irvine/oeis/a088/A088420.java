package irvine.oeis.a088;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A088420 Number of primes in arithmetic progression starting with 3 and with d = 2n.
 * @author Georg Fischer
 */
public class A088420 extends AbstractSequence {

  private int mN;
  private Z mStart;

  /** Construct the sequence. */
  public A088420() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start start with this prime number
   */
  public A088420(final int offset, final int start) {
    super(offset);
    mN = 0;
    mStart = Z.valueOf(start);
  }

  @Override
  public Z next() {
    ++mN;
    int count = 1;
    final int dist = 2 * mN;
    Z p = mStart.add(dist);
    while (Predicates.PRIME.is(p)) {
      ++count;
      p = p.add(dist);
    }
    return Z.valueOf(count);
  }
}
