package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037727 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3,1.
 * @author Sean A. Irvine
 */
public class A037727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037727() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {2, 16, 131, 1049, 8394});
  }
}
