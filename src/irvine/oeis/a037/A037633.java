package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037633 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,3</code>.
 * @author Sean A. Irvine
 */
public class A037633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037633() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 58, 292});
  }
}
