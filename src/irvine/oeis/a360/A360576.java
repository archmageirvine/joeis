package irvine.oeis.a360;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A360576 Number of 3-dimensional tilings of a 2 X 2 X n box using 1 X 1 X 1 cubes, 2 X 2 X 1 plates and trominos (L-shaped connection of 3 cubes).
 * @author Georg Fischer
 */
public class A360576 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A360576() {
    super(0, "[1,-9,4,-16]", "[1,-15,-28,214,-192,-384,128]");
  }
}
