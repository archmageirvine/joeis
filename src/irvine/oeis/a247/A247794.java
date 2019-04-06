package irvine.oeis.a247;

import irvine.oeis.FiniteSequence;

/**
 * A247794 a(n)^3 is the least cube to contain exactly n distinct digits.
 * @author Georg Fischer
 */
public class A247794 extends FiniteSequence {

  /** Construct the sequence. */
  public A247794() {
    super(0, 3, 5, 12, 22, 59, 135, 289, 1018, 2326);
  }
}
