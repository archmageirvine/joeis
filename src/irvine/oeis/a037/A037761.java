package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037761 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1,2.
 * @author Sean A. Irvine
 */
public class A037761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037761() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {3, 21, 148, 1038, 7269});
  }
}
