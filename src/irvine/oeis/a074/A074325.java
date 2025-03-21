package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a033.A033844;
/**
 * A074325 Difference between (1+2^n)-th and (2^n)-th primes. Also number of terms in blocks of A073798.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A074325 extends Sequence0 {

  private final Sequence mA033844 = new A033844();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z p = mA033844.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
