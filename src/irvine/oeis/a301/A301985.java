package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A301985 a(n) = n^2 + 2329*n + 1697.
 * @author Georg Fischer
 */
public class A301985 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301985() {
    super(0, new long[] {1697, -1064, -631},
      new long[] {1, -3, 3, -1});
  }
}
