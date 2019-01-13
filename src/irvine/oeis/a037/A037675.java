package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037675.
 * @author Sean A. Irvine
 */
public class A037675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037675() {
    super(new long[] {-5, 6, -6, 6}, new long[] {1, 5, 27, 138});
  }
}
