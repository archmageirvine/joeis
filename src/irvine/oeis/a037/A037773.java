package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037773 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037773() {
    super(new long[] {-5, 6, -6, 6}, new long[] {3, 16, 80, 402});
  }
}
