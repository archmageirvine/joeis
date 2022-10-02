package irvine.oeis.a059;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a040.A040028;
import irvine.oeis.a049.A049550;

/**
 * A059666 Primes p such that x^54 = 2 has no solution mod p, but x^18 = 2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A059666 extends IntersectionSequence {

  /** Construct the sequence. */
  public A059666() {
    super(new A049550(), new A040028(54, 2, false));
  }
}
