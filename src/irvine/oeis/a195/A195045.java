package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195045 Concentric 13-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195045() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 13, 27});
  }
}
