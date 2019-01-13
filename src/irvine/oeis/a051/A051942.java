package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051942.
 * @author Sean A. Irvine
 */
public class A051942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051942() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 21});
  }
}
