package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037496 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037496() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 3, 11, 34});
  }
}
