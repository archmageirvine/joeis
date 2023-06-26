package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211345 a(n) is the largest n-digit number whose last k digits are divisible by the k-th prime for k = 1..n.
 * @author Georg Fischer
 */
public class A211345 extends FiniteSequence {

  /** Construct the sequence. */
  public A211345() {
    super(1, FINITE, 8, 96, 990, 9800, 99660, 881400, 9747630, 81377000, 904719030L);
  }
}
