package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037755 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1,0.
 * @author Sean A. Irvine
 */
public class A037755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037755() {
    super(new long[] {-8, 9, -9, 9}, new long[] {2, 19, 153, 1224});
  }
}
