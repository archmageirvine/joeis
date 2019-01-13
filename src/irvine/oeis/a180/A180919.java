package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180919.
 * @author Sean A. Irvine
 */
public class A180919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180919() {
    super(new long[] {1, -3, 3}, new long[] {1, 733, 1467});
  }
}
