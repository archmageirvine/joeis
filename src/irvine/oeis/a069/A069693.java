package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069693 Triangular numbers with either no internal digits or all internal digits are 0.
 * @author Georg Fischer
 */
public class A069693 extends FiniteSequence {

  /** Construct the sequence. */
  public A069693() {
    super(0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 300, 406, 703, 903, 3003, 4005, 8001);
  }
}
