package irvine.oeis.a241;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A241621 Number of length 6+2 0..n arrays with no consecutive three elements summing to more than n.
 * @author Georg Fischer
 */
public class A241621 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A241621() {
    super(1, new long[] {0, 28, 35, 155, -107, 127, -84, 36, -9, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
