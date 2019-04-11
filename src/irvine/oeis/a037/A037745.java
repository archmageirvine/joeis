package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037745 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,3,0,1</code>.
 * @author Sean A. Irvine
 */
public class A037745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037745() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {2, 13, 65, 326, 1632});
  }
}
