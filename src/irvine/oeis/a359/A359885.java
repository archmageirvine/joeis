package irvine.oeis.a359;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A359885 Number of 3-dimensional tilings of a 2 X 2 X 3n box using trominos (three 1 X 1 X 1 cubes).
 * @author Georg Fischer
 */
public class A359885 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A359885() {
    super(0, "[1,-16]", "[1,-60,128]");
  }
}
