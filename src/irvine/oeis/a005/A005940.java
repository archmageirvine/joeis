package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005940 The Doudna sequence: write n-1 in binary; power of prime(k) in a(n) is # of 1's that are followed by k-1 0's.
 * @author Sean A. Irvine
 */
public class A005940 extends AbstractSequence {

  /** Construct the sequence. */
  public A005940() {
    super(1);
  }

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long m = mN++;
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
}
