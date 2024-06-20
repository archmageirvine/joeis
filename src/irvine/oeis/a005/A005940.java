package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A005940 The Doudna sequence: write n-1 in binary; power of prime(k) in a(n) is # of 1's that are followed by k-1 0's.
 * @author Sean A. Irvine
 */
public class A005940 extends AbstractSequence implements DirectSequence {

  private int mN = 0;
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A005940() {
    super(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005940(final int offset) {
    super(offset);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    int m = n - 1;
    Z prod = Z.ONE;
    Z p = Z.TWO;
    do {
      if ((m & 1) == 1) {
        prod = prod.multiply(p);
      } else {
        p = mPrime.nextPrime(p);
      }
    } while ((m >>>= 1) > 0);
    return prod;
  }

  @Override
  public Z a(final Z n) {
    Z m = n.subtract(1);
    Z prod = Z.ONE;
    Z p = Z.TWO;
    do {
      if (m.testBit(0)) {
        prod = prod.multiply(p);
      } else {
        p = mPrime.nextPrime(p);
      }
      m = m.divide2();
    } while (m.compareTo(Z.ZERO) > 0);
    return prod;
  }

}
