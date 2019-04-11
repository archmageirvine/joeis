package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037630 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037630() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 21, 189, 1703});
  }
}
