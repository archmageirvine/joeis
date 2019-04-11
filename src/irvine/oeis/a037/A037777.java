package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037777 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,0,2.
 * @author Sean A. Irvine
 */
public class A037777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037777() {
    super(new long[] {-9, 10, -10, 10}, new long[] {3, 28, 252, 2270});
  }
}
