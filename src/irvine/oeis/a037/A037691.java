package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037691 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037691() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 9, 63, 444, 3109});
  }
}
