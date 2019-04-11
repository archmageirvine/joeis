package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037791 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,2,0,1</code>.
 * @author Sean A. Irvine
 */
public class A037791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037791() {
    super(new long[] {-9, 10, -10, 10}, new long[] {3, 29, 261, 2350});
  }
}
