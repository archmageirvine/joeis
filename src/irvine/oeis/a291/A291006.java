package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291006.
 * @author Sean A. Irvine
 */
public class A291006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291006() {
    super(new long[] {-1, 6, -8, 5}, new long[] {1, 3, 9, 27});
  }
}
