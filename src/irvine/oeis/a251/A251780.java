package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251780.
 * @author Sean A. Irvine
 */
public class A251780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251780() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 3, 7, 6, 6, 4, 6, 9});
  }
}
