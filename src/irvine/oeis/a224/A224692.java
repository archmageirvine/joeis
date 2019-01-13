package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224692.
 * @author Sean A. Irvine
 */
public class A224692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224692() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 5, 10, 14});
  }
}
