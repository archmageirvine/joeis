package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037696 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3,0.
 * @author Sean A. Irvine
 */
public class A037696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037696() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {1, 7, 38, 190, 951});
  }
}
