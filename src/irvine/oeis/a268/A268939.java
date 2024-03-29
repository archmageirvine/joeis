package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268939 Number of length-n 0..3 arrays with no repeated value unequal to the previous repeated value plus one mod 3+1.
 * @author Georg Fischer
 */
public class A268939 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A268939() {
    super(1, new long[] {0, 4, -4, -12},
      new long[] {1, -5, 2, 12});
  }
}
