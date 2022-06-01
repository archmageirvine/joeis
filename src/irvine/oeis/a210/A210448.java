package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210448 Total number of different letters summed over all ternary words of length n.
 * @author Sean A. Irvine
 */
public class A210448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210448() {
    super(new long[] {-6, 5}, new long[] {0, 3});
  }
}
