package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037679 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,2,3</code>.
 * @author Sean A. Irvine
 */
public class A037679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037679() {
    super(new long[] {-9, 10, -10, 10}, new long[] {1, 9, 83, 750});
  }
}
