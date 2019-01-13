package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180577.
 * @author Sean A. Irvine
 */
public class A180577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180577() {
    super(new long[] {1, -3, 3}, new long[] {15, 80, 195});
  }
}
