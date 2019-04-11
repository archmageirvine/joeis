package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037489 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1</code>.
 * @author Sean A. Irvine
 */
public class A037489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037489() {
    super(new long[] {-4, 1, 4}, new long[] {2, 9, 38});
  }
}
