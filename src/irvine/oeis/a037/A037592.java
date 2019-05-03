package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037592 <code>Base-6</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3.
 * @author Sean A. Irvine
 */
public class A037592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037592() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 6, 39, 235});
  }
}
