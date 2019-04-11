package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037601 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037601() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 11, 88, 705});
  }
}
