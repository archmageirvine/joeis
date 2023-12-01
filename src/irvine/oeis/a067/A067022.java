package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A067022 Exponent of largest power of (n+1)-st prime which is still smaller than the product of first n primes, the n-th primorial.
 * @author Sean A. Irvine
 */
public class A067022 extends Sequence1 {

  private final Sequence mPrimorial = new A002110().skip();
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    final Z prim = mPrimorial.next();
    mP = mPrime.nextPrime(mP);
    return CR.valueOf(prim).log().divide(CR.valueOf(mP).log()).floor();
  }
}
