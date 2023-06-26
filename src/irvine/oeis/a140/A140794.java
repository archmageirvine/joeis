package irvine.oeis.a140;

import irvine.oeis.FiniteSequence;

/**
 * A140794 One of the four smallest counterexamples to the conjecture that the cardinality of the sumset is less than or equal to the cardinality of the difference set of every finite set of integers.
 * @author Georg Fischer
 */
public class A140794 extends FiniteSequence {

  /** Construct the sequence. */
  public A140794() {
    super(1, FINITE, 0, 2, 3, 7, 10, 11, 12, 14);
  }
}
