package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037616 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2.
 * @author Sean A. Irvine
 */
public class A037616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037616() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 12, 110, 991});
  }
}
