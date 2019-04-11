package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037774 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037774() {
    super(new long[] {-6, 7, -7, 7}, new long[] {3, 19, 114, 686});
  }
}
