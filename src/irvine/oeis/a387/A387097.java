package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387097 Numbers k such that k &gt; prime(bigomega(k))#, where prime(bigomega(k))# is the product of the first bigomega(k) primes and bigomega(k) is the number of prime divisors of k (counted multiplicity).
 * @author Sean A. Irvine
 */
public class A387097 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(Functions.PRIMORIAL_COUNT.z(Functions.BIG_OMEGA.l(mN))) > 0) {
        return mN;
      }
    }
  }
}

