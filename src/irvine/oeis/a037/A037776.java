package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037776 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037776() {
    super(new long[] {-8, 9, -9, 9}, new long[] {3, 25, 200, 1602});
  }
}
