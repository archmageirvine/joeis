package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A277411 Column 1 of triangle A277410.
 * @author Georg Fischer
 */
public class A277411 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A277411() {
    super(1, new long[] {0, 0, 3, -2},
      new long[] {1, -5, 9, -7, 2});
  }
}
