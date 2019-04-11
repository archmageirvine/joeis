package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037578 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3</code>.
 * @author Sean A. Irvine
 */
public class A037578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037578() {
    super(new long[] {-6, 1, 6}, new long[] {1, 9, 55});
  }
}
