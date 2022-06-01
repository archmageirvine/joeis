package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037668 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,0.
 * @author Sean A. Irvine
 */
public class A037668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037668() {
    super(new long[] {-5, 1, 0, 5}, new long[] {3, 17, 85, 428});
  }
}
