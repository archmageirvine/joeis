package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059876 a(n) = bin_prime_sum(n).
 * @author Sean A. Irvine
 */
public class A059876 extends AbstractSequence {

  /** Construct the sequence. */
  public A059876() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  protected long mN = 0;

  protected Z binPrimeSum(final Z n) {
    final long s = n.bitLength() - 1;
    long p = 1;
    Z sum = n.isOdd() ? Z.ONE : Z.NEG_ONE;
    Z m = n.divide2();
    for (int k = 1; k <= s; ++k, m = m.divide2()) {
      p = mPrime.nextPrime(p);
      sum = sum.signedAdd(m.isOdd(), Z.valueOf(p));
    }
    if (Z.ONE.equals(n)) {
      sum = sum.add(1);
    } else if ((s & 1) == 0) {
      sum = sum.add(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    return binPrimeSum(Z.valueOf(++mN));
  }
}
