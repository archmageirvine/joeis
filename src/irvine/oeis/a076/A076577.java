package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A076577 Sum of squares of divisors d of n such that n/d is odd.
 * <code> b(2^e, k) = 2^(k*e), b(p^e, k) = (p^(ke+k)-1)/(p^k-1)</code>
 * @author Georg Fischer
 */
public class A076577 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A076577() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param k exponent
   */
  public A076577(final int offset, final int k) {
    super(offset, (p, e) -> is2(p) ? Z.ONE.shiftLeft(k * e) : p.pow(k * e + k).subtract(1).divide(p.pow(k).subtract(1)));
  }
}
