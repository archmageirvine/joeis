package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037544 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,2.
 * @author Sean A. Irvine
 */
public class A037544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037544() {
    super(1, new long[] {-3, 1, 0, 3}, new long[] {1, 5, 17, 52});
  }
}
