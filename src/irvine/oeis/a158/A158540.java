package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158540.
 * @author Sean A. Irvine
 */
public class A158540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158540() {
    super(new long[] {1, -3, 3}, new long[] {21, 87, 197});
  }
}
