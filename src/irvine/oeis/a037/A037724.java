package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037724 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3,1.
 * @author Sean A. Irvine
 */
public class A037724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037724() {
    super(1, new long[] {-5, 1, 0, 0, 5}, new long[] {2, 10, 53, 266, 1332});
  }
}
