package irvine.oeis.a184;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A184545 Number of (n+2) X 8 binary arrays with each 3 X 3 subblock having rows and columns in lexicographically nondecreasing order.
 * @author Georg Fischer
 */
public class A184545 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A184545() {
    super(1, new long[] {0, 415, -2621, 7327, -11699, 11605, -7310, 2861, -641, 64},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
