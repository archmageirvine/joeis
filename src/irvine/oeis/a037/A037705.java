package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037705 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0,2.
 * @author Sean A. Irvine
 */
public class A037705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037705() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 10, 70, 492, 3445});
  }
}
