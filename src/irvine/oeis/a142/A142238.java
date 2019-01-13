package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142238.
 * @author Sean A. Irvine
 */
public class A142238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142238() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 5, 11, 49});
  }
}
