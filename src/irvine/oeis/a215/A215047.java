package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A215047 Number of primes of the form 1 + b^2 for 1 &lt; b &lt; 10^n.
 * @author Georg Fischer
 */
public class A215047 extends AbstractSequence {

  private Z mPow2;
  private Z mPow10;
  private Z mA; // old term

  /** Construct the sequence. */
  public A215047() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param exp2 exponent of 2
   */
  public A215047(final int offset, final int exp2) {
    super(offset);
    mPow2 = Z.ONE.shiftLeft(exp2);
    mPow10 = Z.TEN;
  }

  @Override
  public Z next() {
    // n -> SU(1, ZV(10).^(n)./(2).-(1).intValueExact(), b -> ZV(2*b).^(    2).+(1).IPP() ? Z.ONE : Z.ZERO)
    // A215047: a(n) = sum(b=1, 10^n/2-1, isprime((2*b)^2+1))
    // A215699: a(n) = sum(b=1, 10^n/2-1, isprime((2*b)^512+1))
    Z sum = Z.ZERO;
    Z b = Z.ONE;
    final Z limit = mPow10.divide2().subtract(1);
    while (b.compareTo(limit) <= 0) {
      if (b.multiply(2).pow(mPow2).add(1).isProbablePrime()) {
        sum = sum.add(1);
      }
      b = b.add(1);
    }
    mPow10 = mPow10.multiply(10);
    return sum;
  }
}
