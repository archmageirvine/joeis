package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075664.
 * @author Sean A. Irvine
 */
public class A075664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075664() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 35, 405, 2584, 11375, 38961, 111475, 278720});
  }
}
