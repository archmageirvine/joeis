package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037739 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3,0.
 * @author Sean A. Irvine
 */
public class A037739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037739() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {2, 13, 81, 486, 2918});
  }
}
