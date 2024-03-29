package irvine.oeis.a165;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A165204 Hankel transform of A165203.
 * @author Georg Fischer
 */
public class A165204 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A165204() {
    super(0, new long[] {1, -8, 2, -1},
      new long[] {1, -3, 8, -3, 1});
  }
}
