package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270695 Alternating sum of centered octagonal pyramidal numbers.
 * @author Georg Fischer
 */
public class A270695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270695() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 9, -26, 58});
  }
}
