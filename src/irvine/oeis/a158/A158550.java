package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158550.
 * @author Sean A. Irvine
 */
public class A158550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158550() {
    super(new long[] {1, -3, 3}, new long[] {156, 663, 1508});
  }
}
