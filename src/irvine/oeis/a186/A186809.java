package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186809 Period 6 sequence <code>[0, 1, 2, 0, -2, -1, </code>...].
 * @author Sean A. Irvine
 */
public class A186809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186809() {
    super(new long[] {-1, 0, -1, 0}, new long[] {0, 1, 2, 0});
  }
}
