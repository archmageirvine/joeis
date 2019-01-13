package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070302.
 * @author Sean A. Irvine
 */
public class A070302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070302() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 19, 121, 439, 1171});
  }
}
