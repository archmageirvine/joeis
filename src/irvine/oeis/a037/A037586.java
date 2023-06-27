package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037586 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 3,1.
 * @author Sean A. Irvine
 */
public class A037586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037586() {
    super(1, new long[] {-7, 1, 7}, new long[] {3, 22, 157});
  }
}
