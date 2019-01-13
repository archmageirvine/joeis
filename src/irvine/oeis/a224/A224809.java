package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224809.
 * @author Sean A. Irvine
 */
public class A224809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224809() {
    super(new long[] {-1, 0, 0, 1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 4, 6, 9});
  }
}
