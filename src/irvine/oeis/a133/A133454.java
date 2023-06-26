package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133454 Chain of 6 highly composite numbers generated when subject to the recurrence relation tau(a(n+1)) = a(n), with a(0)=3, where tau(n) is the number-of-divisors function A000005(n).
 * @author Georg Fischer
 */
public class A133454 extends FiniteSequence {

  /** Construct the sequence. */
  public A133454() {
    super(1, FINITE, 4, 6, 12, 60, 5040, 293318625600L);
  }
}
