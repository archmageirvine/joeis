package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037775 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,0,2.
 * @author Sean A. Irvine
 */
public class A037775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037775() {
    super(1, new long[] {-7, 8, -8, 8}, new long[] {3, 22, 154, 1080});
  }
}
