package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037636 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3.
 * @author Sean A. Irvine
 */
public class A037636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037636() {
    super(1, new long[] {-8, 1, 0, 8}, new long[] {2, 17, 139, 1114});
  }
}
