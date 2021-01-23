package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037675 Base-5 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037675() {
    super(new long[] {-5, 6, -6, 6}, new long[] {1, 5, 27, 138});
  }
}
