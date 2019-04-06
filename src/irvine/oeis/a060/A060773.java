package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060773 Numbers having a unique partition into three nonnegative triangular numbers.
 * @author Georg Fischer
 */
public class A060773 extends FiniteSequence {

  /** Construct the sequence. */
  public A060773() {
    super(0, 1, 2, 4, 5, 8, 11, 14, 20, 29, 50, 53);
  }
}
