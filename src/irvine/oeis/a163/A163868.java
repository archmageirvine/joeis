package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163868.
 * @author Sean A. Irvine
 */
public class A163868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163868() {
    super(new long[] {-4, 5}, new long[] {4, 5});
  }
}
