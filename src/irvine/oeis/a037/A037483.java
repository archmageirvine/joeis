package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037483 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2</code>.
 * @author Sean A. Irvine
 */
public class A037483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037483() {
    super(new long[] {-6, 1, 6}, new long[] {1, 8, 49});
  }
}
