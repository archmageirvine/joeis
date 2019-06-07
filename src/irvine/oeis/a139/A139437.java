package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139437 Numbers having exactly one partition into initial terms of a Collatz trajectory starting with a value less than <code>n</code>.
 * @author Georg Fischer
 */
public class A139437 extends FiniteSequence {

  /** Construct the sequence. */
  public A139437() {
    super(3, 5, 6, 8, 10, 11, 16, 17, 20, 23, 25, 32, 41);
  }
}
