package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037650 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1.
 * @author Sean A. Irvine
 */
public class A037650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037650() {
    super(new long[] {-8, 1, 0, 8}, new long[] {3, 24, 193, 1547});
  }
}
