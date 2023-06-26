package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289642 Number of 2-digit numbers whose digits add up to n.
 * @author Georg Fischer
 */
public class A289642 extends FiniteSequence {

  /** Construct the sequence. */
  public A289642() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1);
  }
}
