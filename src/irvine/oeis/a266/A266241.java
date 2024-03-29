package irvine.oeis.a266;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a014.A014137;

/**
 * A266241 Integers n such that average of first n Catalan numbers (A000108) is an integer.
 * @author Georg Fischer
 */
public class A266241 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A266241() {
    super(1, 1, new A014137(), DIVISIBLE_BY_INDEX);
  }
}
