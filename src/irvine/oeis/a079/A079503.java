package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079503.
 * @author Sean A. Irvine
 */
public class A079503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079503() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 2, 8, 54, 320, 1250});
  }
}
