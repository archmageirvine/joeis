package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140113.
 * @author Sean A. Irvine
 */
public class A140113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140113() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 8, 24, 29, 65, 72});
  }
}
