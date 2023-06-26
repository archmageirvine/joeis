package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069694 Triangular numbers with internal digits 2.
 * @author Georg Fischer
 */
public class A069694 extends FiniteSequence {

  /** Construct the sequence. */
  public A069694() {
    super(1, FINITE, 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 120, 325, 528, 820, 1225);
  }
}
