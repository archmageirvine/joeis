package irvine.oeis.a134;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A134812 a(n) = 2a(n-2) + 4a(n-3), n &gt;= 3.
 * @author Georg Fischer
 */
public class A134812 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A134812() {
    super(0, new long[] {0, -1, 1, 1},
      new long[] {-1, 0, 2, 4});
  }
}
