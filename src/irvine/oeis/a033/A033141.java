package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033141.
 * @author Sean A. Irvine
 */
public class A033141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033141() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 5, 25, 126});
  }
}
