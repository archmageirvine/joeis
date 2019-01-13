package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109248.
 * @author Sean A. Irvine
 */
public class A109248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109248() {
    super(new long[] {-1, 1, 0}, new long[] {1, -1, -1});
  }
}
