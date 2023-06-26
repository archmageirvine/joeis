package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168519 Number of 2n-digit primes that are concatenation of n two-digit distinct primes p_1...p_n: 10&lt;p_1&lt;p_2&lt;...&lt;p_n&gt;98.
 * @author Georg Fischer
 */
public class A168519 extends FiniteSequence {

  /** Construct the sequence. */
  public A168519() {
    super(1, FINITE, 21, 44, 323, 785, 2620, 4925, 10184, 13848, 19697, 19302, 19040, 13450, 9269, 4538, 2174, 633, 231, 44, 3, 0, 0);
  }
}
