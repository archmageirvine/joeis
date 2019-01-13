package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047536.
 * @author Sean A. Irvine
 */
public class A047536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047536() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 4, 7, 8});
  }
}
