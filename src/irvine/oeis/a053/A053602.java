package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053602.
 * @author Sean A. Irvine
 */
public class A053602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053602() {
    super(new long[] {1, 0, 1, 0}, new long[] {0, 1, 1, 2});
  }
}
