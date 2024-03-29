package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211620 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and -1&lt;=2w+x+y&lt;=1.
 * @author Georg Fischer
 */
public class A211620 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211620() {
    super(0, new long[] {0, 2, 12, 6, 4},
      new long[] {1, -2, 0, 2, -1});
  }
}
