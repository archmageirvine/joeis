package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109620.
 * @author Sean A. Irvine
 */
public class A109620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109620() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, -3, -2});
  }
}
