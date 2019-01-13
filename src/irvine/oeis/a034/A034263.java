package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034263.
 * @author Sean A. Irvine
 */
public class A034263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034263() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 9, 39, 119, 294, 630});
  }
}
