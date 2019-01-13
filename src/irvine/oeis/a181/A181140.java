package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181140.
 * @author Sean A. Irvine
 */
public class A181140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181140() {
    super(new long[] {2, 2, 2, 2}, new long[] {3, 9, 27, 81});
  }
}
