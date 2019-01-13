package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268581.
 * @author Sean A. Irvine
 */
public class A268581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268581() {
    super(new long[] {1, -3, 3}, new long[] {5, 15, 29});
  }
}
