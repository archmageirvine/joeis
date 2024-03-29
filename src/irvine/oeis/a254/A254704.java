package irvine.oeis.a254;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A254704 Number of length 6+4 0..n arrays with every five consecutive terms having the maximum of some two terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A254704 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A254704() {
    super(1, new long[] {0, 212, 2846, 6804, 1163, -472, -48, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
