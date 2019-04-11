package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037732 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037732() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {2, 13, 78, 471, 2828});
  }
}
