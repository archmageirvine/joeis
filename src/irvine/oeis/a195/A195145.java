package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195145 Concentric 14-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195145() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 14, 29});
  }
}
