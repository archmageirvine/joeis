package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037529 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,2.
 * @author Sean A. Irvine
 */
public class A037529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037529() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {1, 5, 22, 89});
  }
}
