package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117189 Binomial transform of the tribonacci sequence <code>A000073 (shifted</code> left <code>twice)</code>.
 * @author Sean A. Irvine
 */
public class A117189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117189() {
    super(new long[] {2, -4, 4}, new long[] {1, 2, 5});
  }
}
