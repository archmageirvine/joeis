package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168513 Number of 2n-digit primes that are concatenation of n two-digit distinct primes p_1...p_n, 98&gt;p_1&gt;p_2&gt;...&gt;p_n&gt;10.
 * @author Georg Fischer
 */
public class A168513 extends FiniteSequence {

  /** Construct the sequence. */
  public A168513() {
    super(21, 36, 300, 722, 2493, 4766, 9459, 13091, 18484, 18779, 18048, 12995, 9122, 4424, 2160, 639, 234, 48, 8, 0, 0);
  }
}
