package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158741.
 * @author Sean A. Irvine
 */
public class A158741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158741() {
    super(new long[] {1, -3, 3}, new long[] {37, 1406, 5513});
  }
}
