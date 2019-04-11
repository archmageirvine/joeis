package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037628 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037628() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 17, 119, 835});
  }
}
