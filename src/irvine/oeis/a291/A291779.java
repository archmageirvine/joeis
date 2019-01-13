package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291779.
 * @author Sean A. Irvine
 */
public class A291779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291779() {
    super(new long[] {-8, 4, 0, 2}, new long[] {0, 1, 2, 4});
  }
}
