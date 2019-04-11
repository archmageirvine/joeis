package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037660 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037660() {
    super(new long[] {-4, 1, 0, 4}, new long[] {3, 13, 52, 211});
  }
}
