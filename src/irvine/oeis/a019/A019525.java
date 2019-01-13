package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019525.
 * @author Sean A. Irvine
 */
public class A019525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019525() {
    super(new long[] {-3, 2, 2}, new long[] {2, 3, 6});
  }
}
