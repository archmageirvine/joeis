package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037623 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3.
 * @author Sean A. Irvine
 */
public class A037623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037623() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 18, 165, 1487});
  }
}
