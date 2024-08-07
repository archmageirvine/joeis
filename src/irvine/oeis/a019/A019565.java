package irvine.oeis.a019;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A019565 The squarefree numbers ordered lexicographically by their prime factorization (with factors written in decreasing order). a(n) = Product_{k in I} prime(k+1), where I is the set of indices of nonzero binary digits in n = Sum_{k in I} 2^k.
 * @author Sean A. Irvine
 */
public class A019565 extends Sequence0 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    long p = 1;
    while (m != 0) {
      p = mPrime.nextPrime(p);
      if ((m & 1) == 1) {
        prod = prod.multiply(p);
      }
      m >>>= 1;
    }
    return prod;
  }

  @Override
  public final Z a(final Z n) {
    Z m = n;
    Z prod = Z.ONE;
    long p = 1;
    while (!m.isZero()) {
      p = mPrime.nextPrime(p);
      if (m.testBit(0)) {
        prod = prod.multiply(p);
      }
      m = m.shiftRight(1);
    }
    return prod;
  }

  @Override
  public final Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
