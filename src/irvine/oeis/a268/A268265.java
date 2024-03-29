package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268265 Number of length-(6+1) 0..n arrays with new repeated values introduced in sequential order starting with zero.
 * @author Georg Fischer
 */
public class A268265 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A268265() {
    super(1, new long[] {0, 65, 197, 1576, 1961, 1016, 271, -76, 35, -5},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
