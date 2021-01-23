package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037480 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,2.
 * @author Sean A. Irvine
 */
public class A037480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037480() {
    super(new long[] {-3, 1, 3}, new long[] {1, 5, 16});
  }
}
