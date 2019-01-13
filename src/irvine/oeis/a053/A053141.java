package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053141.
 * @author Sean A. Irvine
 */
public class A053141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053141() {
    super(new long[] {1, -7, 7}, new long[] {0, 2, 14});
  }
}
