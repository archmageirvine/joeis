package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A298023 Partial sums of A298022.
 * @author Georg Fischer
 */
public class A298023 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A298023() {
    super(0, new long[] {1, 2, 4, 4, 3, 2, 0, 0, -2},
      new long[] {1, -2, 1, -1, 2, -1});
  }
}
