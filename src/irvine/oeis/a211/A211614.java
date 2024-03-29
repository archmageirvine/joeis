package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211614 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and w+x+y&gt;2.
 * @author Georg Fischer
 */
public class A211614 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211614() {
    super(0, new long[] {0, 1, 7, 19, -6, 3},
      new long[] {1, -4, 6, -4, 1});
  }
}
