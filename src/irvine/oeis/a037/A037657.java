package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037657 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037657() {
    super(new long[] {-8, 1, 0, 8}, new long[] {3, 24, 194, 1555});
  }
}
