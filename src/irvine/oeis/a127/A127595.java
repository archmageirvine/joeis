package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127595.
 * @author Sean A. Irvine
 */
public class A127595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127595() {
    super(new long[] {-1, 10, -23, 10}, new long[] {0, 1, 15, 128});
  }
}
