package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211345 The largest n-digit number where last k digits are divisible by k-th prime for <code>k = 1..n</code>.
 * @author Georg Fischer
 */
public class A211345 extends FiniteSequence {

  /** Construct the sequence. */
  public A211345() {
    super(8, 96, 990, 9800, 99660, 881400, 9747630, 81377000, 904719030L);
  }
}
