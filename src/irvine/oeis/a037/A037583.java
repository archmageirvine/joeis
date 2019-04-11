package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037583 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1</code>.
 * @author Sean A. Irvine
 */
public class A037583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037583() {
    super(new long[] {-4, 1, 4}, new long[] {3, 13, 55});
  }
}
