package irvine.oeis.a168;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A168067 n*(n^7+1)/2.
 * @author Georg Fischer
 */
public class A168067 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A168067() {
    super(0, new long[] {0, 1, 120, 2157, 7792, 7827, 2136, 127},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
