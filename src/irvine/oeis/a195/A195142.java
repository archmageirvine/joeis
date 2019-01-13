package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195142.
 * @author Sean A. Irvine
 */
public class A195142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195142() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 10, 21});
  }
}
