package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001567;

/**
 * A085999 For p = prime(n), a(n) is the smallest base-2 pseudoprime N (that is, 2^(N-1) = 1 mod N) such that p divides N.
 * @author Sean A. Irvine
 */
public class A085999 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A001567());
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 0;
    while (true) {
      if (mA.a(++k).mod(mP) == 0) {
        return mA.a(k);
      }
    }
  }
}
