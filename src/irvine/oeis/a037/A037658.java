package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037658 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037658() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 27, 245, 2208});
  }
}
