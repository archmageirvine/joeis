package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102543.
 * @author Sean A. Irvine
 */
public class A102543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102543() {
    super(new long[] {-1, 0, -1, 1, -1, 0, 0, 1, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 6, 8});
  }
}
