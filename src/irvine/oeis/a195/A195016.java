package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195016.
 * @author Sean A. Irvine
 */
public class A195016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195016() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 7, 17, 34});
  }
}
