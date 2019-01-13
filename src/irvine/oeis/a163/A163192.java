package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163192.
 * @author Sean A. Irvine
 */
public class A163192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163192() {
    super(new long[] {-93, 20}, new long[] {1, 10});
  }
}
