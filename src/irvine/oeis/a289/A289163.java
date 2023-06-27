package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289163 Number of 5-cycles in the n X n black bishop graph.
 * @author Sean A. Irvine
 */
public class A289163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289163() {
    super(1, new long[] {1, -2, -4, 10, 5, -20, 0, 20, -5, -10, 4, 2}, new long[] {0, 0, 0, 10, 84, 322, 1172, 2780, 7016, 13532, 27720, 47318});
  }
}
