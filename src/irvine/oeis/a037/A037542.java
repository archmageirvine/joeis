package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037542 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037542() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 11, 100, 901});
  }
}
