package irvine.oeis.a183;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183877 Number of arrangements of n+2 numbers in 0..2 with each number being the sum mod 3 of two others.
 * @author Georg Fischer
 */
public class A183877 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A183877() {
    super(1, new long[] {0, 1, 25, -3, -33, 18}, new long[] {1, -6, 12, -10, 3});
  }
}
