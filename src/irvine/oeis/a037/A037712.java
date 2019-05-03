package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037712 <code>Base-7</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2,0.
 * @author Sean A. Irvine
 */
public class A037712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037712() {
    super(new long[] {-7, 8, -8, 8}, new long[] {1, 10, 72, 504});
  }
}
