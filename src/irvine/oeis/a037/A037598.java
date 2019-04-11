package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037598 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037598() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 8, 40, 201});
  }
}
