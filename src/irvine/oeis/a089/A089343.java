package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089343.
 * @author Sean A. Irvine
 */
public class A089343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089343() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 12, 231, 3735});
  }
}
