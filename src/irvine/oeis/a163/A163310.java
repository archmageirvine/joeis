package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163310.
 * @author Sean A. Irvine
 */
public class A163310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163310() {
    super(new long[] {-95, 20}, new long[] {1, 11});
  }
}
