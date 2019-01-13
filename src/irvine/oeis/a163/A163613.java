package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163613.
 * @author Sean A. Irvine
 */
public class A163613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163613() {
    super(new long[] {-2, 4}, new long[] {1, 8});
  }
}
