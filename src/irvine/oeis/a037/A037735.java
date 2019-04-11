package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037735 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,0,3</code>.
 * @author Sean A. Irvine
 */
public class A037735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037735() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {2, 19, 171, 1542, 13880});
  }
}
