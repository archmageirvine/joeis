package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069099 Centered heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A069099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069099() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 8, 22});
  }
}
