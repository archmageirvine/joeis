package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086321 Primes produced by repeated application of the formula p -&gt; (6p +- 5) starting at the prime 2.
 * @author Georg Fischer
 */
public class A086321 extends FiniteSequence {

  /** Construct the sequence. */
  public A086321() {
    super(1, FINITE, 2, 7, 17, 37, 47, 97, 107, 227, 277, 577, 587, 647, 1367, 1657, 1667, 3457, 3467, 3517, 3527, 3877, 10007, 20747, 20807, 21107, 21157, 60037, 124477, 124847);
  }
}
