package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037608 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,3</code>.
 * @author Sean A. Irvine
 */
public class A037608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037608() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 10, 83, 665});
  }
}
