package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037719 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1,3.
 * @author Sean A. Irvine
 */
public class A037719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037719() {
    super(new long[] {-7, 8, -8, 8}, new long[] {2, 14, 99, 696});
  }
}
