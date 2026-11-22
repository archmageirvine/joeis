package irvine.oeis.a395;

import irvine.oeis.NoncomputableSequence;

/**
 * A395424 Busy Beaver problem for FRACTRAN: a(n) is the maximal number of steps that a FRACTRAN program of size n can make on the integer 2 before eventually halting.
 * @author Gregory Morse
 */
public class A395424 extends NoncomputableSequence {
  // Known exact maxima through size 21; see BBfLean in the OEIS entry.
  /** Construct the sequence. */
  public A395424() {
    super(2, NONCOMPUTABLE, 1, 1, 1, 2, 3, 4, 5, 6, 7, 10, 13, 17, 21, 28, 53, 107, 211, 370, 746, 31957632);
  }
}
