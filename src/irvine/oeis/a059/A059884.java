package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059884 Prime factorization of n encoded by recursively interleaving bits of successive prime exponents.
 * @author Sean A. Irvine
 */
public class A059884 extends AbstractSequence {

  /** Construct the sequence. */
  public A059884() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected Z encode(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z last = fs.largestPrimeFactor();
    Z encoding = Z.ZERO;
    int k = 0;
    for (Z p = Z.TWO; p.compareTo(last) <= 0; p = mPrime.nextPrime(p)) {
      int e = fs.getExponent(p);
      int s = (1 << k) - 1;
      ++k;
      while (e != 0) {
        if ((e & 1) == 1) {
          encoding = encoding.setBit(s);
        }
        s += 1 << k;
        e >>>= 1;
      }
    }
    return encoding;
  }

  @Override
  public Z next() {
    return encode(Z.valueOf(++mN));
  }
}
