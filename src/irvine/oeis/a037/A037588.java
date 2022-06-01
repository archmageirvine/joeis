package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037588 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,1.
 * @author Sean A. Irvine
 */
public class A037588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037588() {
    super(new long[] {-9, 1, 9}, new long[] {3, 28, 255});
  }
}
