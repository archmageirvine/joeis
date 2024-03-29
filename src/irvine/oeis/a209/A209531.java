package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A209531 Half the number of (n+1) X 5 0..2 arrays with every 2 X 2 subblock having exactly two distinct clockwise edge differences.
 * @author Georg Fischer
 */
public class A209531 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A209531() {
    super(1, new long[] {0, 33, 160, -224},
      new long[] {1, -1, -32, 32});
  }
}
