package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037726 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,0,3,1</code>.
 * @author Sean A. Irvine
 */
public class A037726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037726() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {2, 14, 101, 708, 4958});
  }
}
