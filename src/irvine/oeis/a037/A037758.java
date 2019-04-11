package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037758 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,1,2</code>.
 * @author Sean A. Irvine
 */
public class A037758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037758() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {3, 12, 49, 198, 795});
  }
}
