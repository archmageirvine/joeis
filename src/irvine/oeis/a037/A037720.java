package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037720 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1,3.
 * @author Sean A. Irvine
 */
public class A037720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037720() {
    super(1, new long[] {-8, 9, -9, 9}, new long[] {2, 16, 129, 1035});
  }
}
