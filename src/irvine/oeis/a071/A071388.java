package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071388 Numbers k such that the cardinality of the set of solutions to phi(x) = k is a prime.
 * @author Sean A. Irvine
 */
public class A071388 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ONE; // only odd term
    }
    while (true) {
      mN = mN.add(2);
      if (mPrime.isPrime(InverseEuler.inversePhi(mN).size())) {
        return mN;
      }
    }
  }
}
