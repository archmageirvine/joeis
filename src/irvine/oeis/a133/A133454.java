package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133454 Chain of 6 highly composite numbers generated when subject to the recurrence relation <code>tau(a(n+1)) = a(n)</code>, with <code>a(0)=3</code>, where <code>tau(n)</code> is the number-of-divisors function <code>A000005(n)</code>.
 * @author Georg Fischer
 */
public class A133454 extends FiniteSequence {

  /** Construct the sequence. */
  public A133454() {
    super(4, 6, 12, 60, 5040, 293318625600L);
  }
}
