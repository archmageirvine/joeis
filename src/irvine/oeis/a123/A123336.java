package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123336.
 * @author Sean A. Irvine
 */
public class A123336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123336() {
    super(new long[] {-1, 18, -58, 18}, new long[] {0, 3, 32, 405});
  }
}
