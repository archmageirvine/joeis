package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085463.
 * @author Sean A. Irvine
 */
public class A085463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085463() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 12, 63, 219, 594, 1365});
  }
}
