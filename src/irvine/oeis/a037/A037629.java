package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037629 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0.
 * @author Sean A. Irvine
 */
public class A037629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037629() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 19, 152, 1218});
  }
}
