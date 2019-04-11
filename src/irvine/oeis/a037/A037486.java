package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037486 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2</code>.
 * @author Sean A. Irvine
 */
public class A037486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037486() {
    super(new long[] {-9, 1, 9}, new long[] {1, 11, 100});
  }
}
