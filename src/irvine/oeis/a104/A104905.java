package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104905 Numbers m such that d(m)*phi(m) = sigma(m), where d(m) is number of positive divisors of m.
 * @author Georg Fischer
 */
public class A104905 extends FiniteSequence {

  /** Construct the sequence. */
  public A104905() {
    super(1, FINITE, 1, 3, 14, 42);
  }
}
