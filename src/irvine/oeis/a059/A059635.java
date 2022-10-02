package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a049.A049560;

/**
 * A059635 Primes p such that x^56 = 2 has no solution mod p, but x^28 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059635 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059635() {
    super(new A059634(), new A049560());
  }
}

