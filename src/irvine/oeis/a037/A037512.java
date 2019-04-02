package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037512 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037512() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 6, 19, 59});
  }
}
