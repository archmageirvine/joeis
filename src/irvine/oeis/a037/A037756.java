package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037756 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,3,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037756() {
    super(new long[] {-9, 10, -10, 10}, new long[] {2, 21, 190, 1710});
  }
}
