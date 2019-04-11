package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037797 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,2,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037797() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {3, 26, 209, 1672, 13379});
  }
}
