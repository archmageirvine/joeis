package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A064989 Multiplicative with a(2^e) = 1 and a(p^e) = prevprime(p)^e for odd primes p.
 * @author Sean A. Irvine
 */
public class A064989 extends MultiplicativeSequence {

  private static final Fast PRIMES = new Fast();

  /** Construct the sequence. */
  public A064989() {
    super(1, (p, e) -> Z.TWO.equals(p) ? Z.ONE : PRIMES.prevPrime(p).pow(e));
  }
}
