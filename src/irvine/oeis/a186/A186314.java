package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186314 Number of ternary strings of length n which contain 01.
 * @author Sean A. Irvine
 */
public class A186314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186314() {
    super(new long[] {3, -10, 6}, new long[] {0, 0, 1});
  }
}
