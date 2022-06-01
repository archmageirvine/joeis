package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086192 Tribonacci numbers that start with first three squares.
 * @author Sean A. Irvine
 */
public class A086192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086192() {
    super(new long[] {1, 1, 1}, new long[] {1, 4, 9});
  }
}
