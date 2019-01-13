package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033119.
 * @author Sean A. Irvine
 */
public class A033119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033119() {
    super(new long[] {-9, 1, 9}, new long[] {1, 9, 82});
  }
}
