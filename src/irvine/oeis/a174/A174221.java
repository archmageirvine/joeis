package irvine.oeis.a174;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A174221 a(n) = n/2 if n is even, otherwise add to n the next three primes &gt; n.
 * @author Georg Fischer
 */
public class A174221 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A174221() {
    this(0, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start start the trajectory with this term
   */
  public A174221(final int offset, final int start) {
    super(offset);
    mN = start - 1;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (!n.testBit(0)) {
      return n.divide(2);
    }
    Z t = Puma.nextPrimeZ(n);
    Z result = n.add(t);
    t = Puma.nextPrimeZ(t);
    result = result.add(t);
    t = Puma.nextPrimeZ(t);
    return result.add(t);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
