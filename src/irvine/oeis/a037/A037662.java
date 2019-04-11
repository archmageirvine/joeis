package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037662 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037662() {
    super(new long[] {-6, 1, 0, 6}, new long[] {3, 19, 114, 687});
  }
}
