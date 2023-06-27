package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037513 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037513() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {2, 8, 33, 134});
  }
}
