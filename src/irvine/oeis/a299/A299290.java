package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A299290 Partial sums of A299289.
 * @author Georg Fischer
 */
public class A299290 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A299290() {
    super(0, new long[] {1, 6, 12, 6, 1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
