package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037753 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1,0.
 * @author Sean A. Irvine
 */
public class A037753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037753() {
    super(new long[] {-6, 7, -7, 7}, new long[] {2, 15, 91, 546});
  }
}
