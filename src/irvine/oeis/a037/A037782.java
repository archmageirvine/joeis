package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037782 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,2,0.
 * @author Sean A. Irvine
 */
public class A037782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037782() {
    super(1, new long[] {-7, 1, 0, 0, 7}, new long[] {3, 22, 156, 1092, 7647});
  }
}
