package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180670.
 * @author Sean A. Irvine
 */
public class A180670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180670() {
    super(new long[] {1, -3, 3, -3, 7, -9, 5}, new long[] {0, 0, 1, 9, 42, 140, 383});
  }
}
