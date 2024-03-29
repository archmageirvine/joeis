package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A200841 Number of 0..n arrays x(0..5) of 6 elements without any two consecutive increases or two consecutive decreases.
 * @author Georg Fischer
 */
public class A200841 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A200841() {
    super(1, new long[] {0, 64, 81, -3, -36, 22, -7, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
