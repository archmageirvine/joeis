package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037748 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0,1.
 * @author Sean A. Irvine
 */
public class A037748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037748() {
    super(1, new long[] {-8, 1, 0, 0, 8}, new long[] {2, 19, 152, 1217, 9738});
  }
}
