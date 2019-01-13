package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020726.
 * @author Sean A. Irvine
 */
public class A020726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020726() {
    super(new long[] {660, -236, 27}, new long[] {1, 27, 493});
  }
}
