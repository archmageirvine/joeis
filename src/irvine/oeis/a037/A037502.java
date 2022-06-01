package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037502 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037502() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 83, 748});
  }
}
