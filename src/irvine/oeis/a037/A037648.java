package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037648 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1.
 * @author Sean A. Irvine
 */
public class A037648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037648() {
    super(new long[] {-6, 1, 0, 6}, new long[] {3, 18, 109, 657});
  }
}
