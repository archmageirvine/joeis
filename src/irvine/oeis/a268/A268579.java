package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268579.
 * @author Sean A. Irvine
 */
public class A268579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268579() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 7, 11, 41, 48, 120, 130});
  }
}
