package irvine.oeis.a264;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264185 Number of (n+1) X (3+1) arrays of permutations of 0..n*4+3 with each element having index change +-(.,.) 0,0 1,-1 or 2,2.
 * @author Georg Fischer
 */
public class A264185 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A264185() {
    super(1, new long[] {0, 8, 1, -90, -144},
      new long[] {1, -10});
  }
}
