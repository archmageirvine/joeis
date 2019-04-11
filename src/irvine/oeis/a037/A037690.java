package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037690 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037690() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {1, 8, 48, 291, 1747});
  }
}
