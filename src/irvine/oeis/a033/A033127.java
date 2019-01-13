package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033127.
 * @author Sean A. Irvine
 */
public class A033127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033127() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 82, 739});
  }
}
