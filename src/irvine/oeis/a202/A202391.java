package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202391.
 * @author Sean A. Irvine
 */
public class A202391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202391() {
    super(new long[] {1, -7, 7}, new long[] {5, 39, 237});
  }
}
