package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037553.
 * @author Sean A. Irvine
 */
public class A037553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037553() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 9, 37, 150});
  }
}
