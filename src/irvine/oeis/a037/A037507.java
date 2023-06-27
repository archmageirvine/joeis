package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037507 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,0.
 * @author Sean A. Irvine
 */
public class A037507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037507() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {1, 8, 48, 289});
  }
}
