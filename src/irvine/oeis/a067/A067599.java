package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A067599 Decimal encoding of the prime factorization of n: concatenation of prime factors and exponents.
 * @author Sean A. Irvine
 */
public class A067599 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return new HomePrimeSequence(++mN, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip().next();
  }
}

