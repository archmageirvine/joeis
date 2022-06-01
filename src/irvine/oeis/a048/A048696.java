package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048696 Generalized Pellian with second term equal to 9.
 * @author Sean A. Irvine
 */
public class A048696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048696() {
    super(new long[] {1, 2}, new long[] {1, 9});
  }
}
