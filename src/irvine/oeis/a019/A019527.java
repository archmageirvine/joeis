package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019527.
 * @author Sean A. Irvine
 */
public class A019527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019527() {
    super(new long[] {0, -1, 1, -1, 2}, new long[] {4, 4, 5, 6, 8});
  }
}
